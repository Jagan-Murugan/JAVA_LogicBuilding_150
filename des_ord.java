public class des_ord {
  public static void main(String[] arg){
    int n = 98765;
    int pre = n % 10;
    n /= 10;
    boolean flag = true;
    while(n > 0){
      int cur = n % 10;
      if(cur > pre){
        pre = cur;
      }
      else{
        flag = false;
        break;
      }
  n /= 10;
    }
    if(flag){
      System.out.println("Yes");
    }
    else
      System.out.println("No");
  }
  
}
