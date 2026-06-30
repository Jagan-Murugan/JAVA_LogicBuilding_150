public class asc_ord {
  public static void main(String[] args){
    int n = 4567;
    int pre = n % 10;
    n = n / 10;
    boolean flag = true;
    while(n>0){
      int cur = n % 10;
      if(cur < pre){
        pre = cur;
      }
      else{
        flag = false;
        break;
      }
      
      n = n / 10;
    }
    if(flag)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  
}
