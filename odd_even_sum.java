public class odd_even_sum {
  public static void main(String[] args) {
      int n = 25578350;
      String option = "odd";
      int sum = 0;
      while(n>0){
        int digit = n % 10;
        if(option.equals("even") && digit % 2 == 0){
          sum += digit;
        }
        else if(option.equals("odd" ) && digit % 2 != 0){
          sum += digit;
        }
        n /=10;
      }
      System.out.println("Even or Odd :"+sum);
      
  }
  
}
