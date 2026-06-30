/*34. Generate Series and Find Nth Element

Series:

1, 2, 4, 7, 11, 16, ...

Input:

6

Output:

16 */

public class Generate_series {
   public static void main(String[] args) {
  int n = 5;
  int term = 1;
  for(int i = 1;i <= n;i++){
    term += i;
    } 
    System.out.println("Output :"+term);
  }
  
}
