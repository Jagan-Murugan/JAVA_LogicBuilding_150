public class palid_poss {
  public static void main(String[] args) {
   int n = 112233441;
  
   int[] freq = new int[10];
   while(n > 0){
    int digit = n % 10;
    freq[digit]++;
    n /=10;
   }   
 int oddcount = 0;
 for(int i = 0;i < 10;i++){
  if(freq[i] % 2 !=0){
    oddcount++;
  }
 }
 if(oddcount <= 1){
  System.out.println("palindrom");
 }
 else 
  System.out.println("Not palindrom");
  }
  
}
