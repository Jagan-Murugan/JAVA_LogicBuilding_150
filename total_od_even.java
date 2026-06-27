public class total_od_even {
  public static void main(String[] args){
    int n = 53467;
    int odd=0,even=0;
    while(n > 0){
      int digit = n % 10;
      if(digit % 2 != 0){
        odd++;
      }
      else{
        even++;
      }
      n /= 10;
    }
  System.out.println("Odd="+odd);
  System.out.println("Even="+even);
  }

  
}
