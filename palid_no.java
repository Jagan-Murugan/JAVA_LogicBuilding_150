public class palid_no {
  public static void main(String[] args) {
      int n = 575;
      int original = n;
      int rev = 0;
      while(n > 0){
        int digit = n % 10;
        rev =rev * 10 + digit;
        n /= 10;
      }
      if(original == rev){
        System.out.println("Palindrom");
      }
      else
        System.out.println("Not Palindrom");
  
    }
}
