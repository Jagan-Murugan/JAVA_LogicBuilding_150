public class digitsum_odd {
  public static void main(String[] args) {
      int n = 234455678;
      int odd = 0;
      while(n > 0){
        int digit = n % 10;
        if(digit % 2 != 0){
          odd += digit;
        }
        n /= 10;
      }
      System.out.println("DigitSum :" + odd);
  }
  
}
