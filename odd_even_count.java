import java.util.*;
public class odd_even_count {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THR NUMBER :");
    int n = sc.nextInt();
    int odd = 0,even = 0;
    while(n > 0){
      int digit = n % 10;
      if(digit % 2 == 0){
        even++;
      }
      else{
        odd++;
      }
    }
    System.out.println("Odd ="+odd);
    System.out.println("Even ="+even);
  }
  
}
