public class Isprime {
  public static void main(String[] args){
    int n =67;
    boolean isprime = true;
    if(n<=1)
      isprime = false;
    else{
      for(int i = 2;i * i<=n;i++){
        if(n % i == 0){
          isprime = false;
          break;
        }
      }
    }
        if(isprime){
          System.out.println("Prime");
        }
        else{
          System.out.println("Is not prime");
        }
      }
        
      }
    
  

