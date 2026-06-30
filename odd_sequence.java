public class odd_sequence {
  public static void main(String[] args){
    int n = 361589;
    String o = "",e="";
    int sum = 0;
    while(n>0){
      int d = n % 10;
      if(d % 2 != 0){
        o = d + o;
        sum += d;
      }
      else{
        e = d + e;
      }
      n /= 10;
    }
    System.out.println("Arrangement :"+o+e);
    System.out.println("Sum of odd : "+sum);

  }
  
}
