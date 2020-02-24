package code.java;

public class Q191 {
    // you need to treat n as an unsigned value
    // n的二进制范围为[0x00000000, 0xffffffff]，按二进制补码记法转成十进制为[Integer.MIN_VALUE, Integer.MAX_VALUE]
    public int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            c += n & 1;
            n = n >>> 1;
        }
        return c;
    }
}
