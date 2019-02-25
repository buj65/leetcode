package code.java;

import java.util.HashMap;
import java.util.Map;

//LRUCache(Least Recently Used)
public class _146 {
    private DNode head;
    private DNode tail;
    private int capacity;
    private Map<Integer, DNode> map;

    public _146(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, DNode>(capacity * 4 / 3 + 1);// 防止rehash
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key).val;
            put(key, val);// 将使用过的缓存放到队尾
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        // 未有缓存
        if (!map.containsKey(key)) {
            DNode node = new DNode(key, value);
            int size = map.size();
            if (size == 0) {// 缓存为空
                head = node;
                tail = node;
            } else {// 缓存不为空
                node.prev = tail;
                tail.next = node;
                tail = node;
                if (size == capacity) {// 缓存已满
                    map.remove(head.key);
                    head = head.next;
                    head.prev.next = null;
                    head.prev = null;
                }
            }
            map.put(key, node);
        }
        // 已有缓存
        else {
            DNode node = map.get(key);
            node.val = value;
            if (node.next == null) {// 队尾
                return;
            }
            if (node.prev == null) {// 队首且非队尾
                head = node.next;
                head.prev = null;

                node.next = null;
                node.prev = tail;
                tail.next = node;
                tail = node;
            } else {// 中间
                node.prev.next = node.next;
                node.next.prev = node.prev;

                node.next = null;
                node.prev = tail;
                tail.next = node;
                tail = node;
            }
        }
    }

    // 双向链表
    private class DNode {
        int key;
        int val;
        DNode prev;
        DNode next;

        public DNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
