public class stepping {
  public static void main(String[] args) {
      int n = 123645;
      int pre = n % 10;
      n /=10;
      boolean isstepping = true;
      while(n > 0){
        int cur = n % 10;
        if(Math.abs(cur - pre) != 1){
          isstepping = false;
          break;

        }
        pre = cur;
        n = n / 10;
      }
      if(isstepping){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      

  }
  
}
