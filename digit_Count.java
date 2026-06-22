public class digit_Count {
  public static void main(String[] args){
    int n =304567;
    int count  = 0;
    if(n==0)
      count = 1;
    else{
    while(n != 0){
      count++;
      n /= 10;
    }
    System.out.println(count);
  }
}
}
