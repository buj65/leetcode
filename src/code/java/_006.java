package code.java;

import java.util.ArrayList;
import java.util.List;

public class _006 {
    public String convert(String s, int numRows) {
        if (s == null || s.length() <= numRows || numRows < 2) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int len = s.length(), cycleLen = numRows * 2 - 2;
        for (int i = 0; i < len; i++) {
            int n = i % cycleLen;
            list.get(n < numRows ? n : cycleLen - n).append(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder str : list) {
            res.append(str);
        }
        return res.toString();
    }
}
