package code.java;

public class _557 {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == ' ') {
                reverse(arr, l, i - 1);
                l = i + 1;
            }
        }
        reverse(arr, l, arr.length - 1);
        return new String(arr);
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
