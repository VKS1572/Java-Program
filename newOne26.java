/*
🧠 Problem Summary

Given an integer numRows, return the first numRows of Pascal’s Triangle.

Rule:
Each number is the sum of the two numbers directly above it.

✅ Approach

Use a List<List<Integer>> to store the triangle.

First and last elements of every row are 1.

Middle elements are calculated using the previous row:
*/
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prev = triangle.get(i - 1);
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
