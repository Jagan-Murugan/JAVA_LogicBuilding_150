/*
39. Create PIN Using Alpha, Beta, Gamma
Example Input
Alpha = 853
Beta = 562
Gamma = 753

Take maximum digit position-wise.

853
562
753

Units:

max(3,2,3)=3

Tens:

max(5,6,5)=6

Hundreds:

max(8,5,7)=8
PIN
863
Output
863
Step-by-step
Position	Digits	Maximum
1	3,2,3	3
10	5,6,5	6
100	8,5,7	8
Best Approach

✔ Extract digits using %10 and /10.

Time Complexity: O(number of digits)
*/
public class Create_Pin {
  public static int createPIN(int a, int b, int c) {
  int pin = 0;
  int place = 1;
  while(a > 0 || b > 0 || c > 0){
    int d1 = a % 10;
    int d2 = b % 10;
    int d3 = c % 10;
    int max = Math.max(d1,Math.max(d2,d3));
    pin += max * place;

    place *=10;
    a /= 10;
    b /= 10;
    c /= 10;
  }
  return pin;
  }

    public static void main(String[] args) {
        System.out.println(createPIN(853, 562, 753));
    }
  
}
