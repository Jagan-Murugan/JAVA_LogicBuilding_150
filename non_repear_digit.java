public class non_repear_digit {
  public static void main(String[] args) {
   int n = 12233445;
   int count  = 0;
   for(int i = 0;i <= 9;i++){
    int temp = n;
    int freq = 0;
    while(temp>0){
      if(temp % 10 == i){
        freq++;
      }
      temp /=10;
    }
    if(freq == 1){
      count++;
    }
   }   
   System.out.println("Non-Repeated Digits Count: " + count);
  }
  
}
