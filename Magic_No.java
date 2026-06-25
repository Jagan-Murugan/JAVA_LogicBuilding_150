public class Magic_No {
  public static void main(String[] args) {
      int n = 1234;
      
      while(n > 9){
        int sum = 0;
        
      while(n >0){
        int digit = n % 10;
        sum += digit;
        n /= 10;
      }
      n = sum;
      }
      if(n == 1){
        System.out.println("This is Magic Numer");
      }
      else
        System.out.println("Not Magic Number");
  }
  
}
