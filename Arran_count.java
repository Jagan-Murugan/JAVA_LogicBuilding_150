public class Arran_count {
  public static void main(String[] args){
    int n = 361589;
    String odd= "",even = "";
    int oddcount =0,evencount = 0;
    while(n > 0){
      int d = n % 10;
      if(d % 2 != 0){
        odd = d + odd;
        oddcount++;
      }
      else{
        even = d + even;
        evencount++;
      }
      n /= 10;
    }
    System.out.println(odd+oddcount+even+evencount);
  }
  
}
