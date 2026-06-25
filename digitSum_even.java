public class digitSum_even {
  public static void main(String[] args) {
      int n = 12345678;
      int even = 0;
      while(n>0){
        int digit = n % 10;
        if(digit % 2 == 0){
          even +=digit;
        }
        n /= 10;
      }
      System.out.println("digitSum :"+even);
  }
  
}
