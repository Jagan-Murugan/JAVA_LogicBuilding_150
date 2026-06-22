public class unique_digit_count {
  public static void main(String[] args) {
  int n = 1222335577;
  int count = 0;
  while(n>0){
    int digit = n % 10;
    int temp = n / 10;
    boolean found = false;
    while(temp > 0){
      if(temp % 10 == digit){
        found = true;
        break;
      }
      temp /=10;
    }
    if(! found){
      count++;
    }
    n /=10;
  }   
  System.out.println("Unique count :"+ count);
  }
  
}
