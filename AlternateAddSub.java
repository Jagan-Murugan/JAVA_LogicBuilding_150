/*
35. Find result after alternate add_sub on N:
Example 1

Input:

N = 6
input2 = 1

Calculation:

6 - 5 + 4 - 3 + 2 - 1
= 3

Output:

3 */

public class AlternateAddSub {
  public static int addsub(int n,int input){
    int result = n;
    boolean add = (input == 2);
    for(int i = n;i >= 0;i--){
      if(add){
        result += i;
      }
      else{
        result -= i;
      }
      add = !add;
    }
    return result; 

  }

  public static void main(String[] args) {
   int n = 6;
   int input = 1;   
   System.out.println("AlternateAddSub:"+(addsub(n,input)));
  }
  
}
