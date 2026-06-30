/*33. Sum of Sums of Digits in Cyclic Order

Input:

1234

Process:

1234 → 1+2+3+4 = 10
2341 → 2+3+4+1 = 10
3412 → 3+4+1+2 = 10
4123 → 4+1+2+3 = 10

Total = 10+10+10+10 = 40*/

public class Cyclic_sum {
  public static void main(String[] args) {
   String n = "1234";
   int len = n.length();
   int total = 0;
   for(int i = 0;i < len;i++){
    int sum = 0;
    for(int j = 0; j < len;j++){
      int index = (j+i)%len;
      sum += n.charAt(index)-'0'; 
    }
    total +=sum;
   }
   System.out.println("Output :"+total);
  }
  
}
