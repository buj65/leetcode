package code.java;

import java.util.ArrayList;
import java.util.List;

public class Q119 {
    /*
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int a = 1;// a always equal to row.get(j-1)
            for (int j = 1; j < row.size(); j++) {
                int b = row.get(j);
                b = a + b;
                a = b - a;
                row.set(j, b);
            }
            row.add(1);
        }
        return row;
    }
    */
    /*
     * 第r行第i项值为C(r,i) = r!/(i!*(r-i)!); r,i下标从0开始
     * 第i项/第(i-1)项 = (r-i+1)/i
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);
        long n = 1;
        for (int i = 1; i <= rowIndex; i++) {
            n = n * (rowIndex - i + 1) / i;// 不能用*=
            row.add((int) n);
        }
        return row;
    }
}
