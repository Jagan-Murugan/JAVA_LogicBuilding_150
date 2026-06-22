public class prime_range {
  public static void main(String[] args){
    int start = 10,end = 50;
    int count = 0;
    for(int  i = start;i<=end;i++){
      if(isprime(i)){
        count++;
        
      }
    }
System.out.println("Number of prime netween:"+ start+ "and" +end + "="+ count );
  }
  public static boolean isprime(int n){
    if(n<= 1){
      return false;

    }
  
      for(int i = 2;i * i <= n;i++){
        if(n%i==0){
          return false; 
        }
      }
    return true;

  }
  
}
