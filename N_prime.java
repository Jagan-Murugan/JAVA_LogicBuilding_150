
public class N_prime {
  public static void main(String[] args){
    int n = 10;
    int count = 0;
    int num = 1;
    while(count< n){
      num++;
    boolean isprime = true;
      for(int i = 2; i * i <= num;i++){
        if(num % i == 0){
          isprime = false;
          break;
        }
      }
        if(isprime){
          count++;
        }
        
      }
    
        System.out.println("Prime count :"+ num);  
  
}
}
