package code.java;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows < 1) {
            return triangle;
        }
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> preRow = triangle.get(i - 1);
            for (int j = 1; j < i; j++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
