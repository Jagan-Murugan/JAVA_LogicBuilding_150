/*
40. Weight of Hill Pattern

Suppose:

Rows = 4

Hill:

1
2 3
4 5 6
7 8 9 10

Weight formula:

Weight = Number × Row Number

Calculate:

Row 1
1×1=1
Row 2
2×2=4
3×2=6
Row 3
4×3=12
5×3=15
6×3=18
Row 4
7×4=28
8×4=32
9×4=36
10×4=40
Total
1+4+6+12+15+18+28+32+36+40
=192
Output
192
Best Approach

✔ Use nested loops.

Time Complexity: O(N²)
*/

public class HillWeight {

    public static int hillWeight(int rows) {
        int sum = 0;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                sum += num * i;
                num++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hillWeight(4));
    }
}