package code.java;

import java.util.ArrayList;
import java.util.List;

public class _119 {
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
}
