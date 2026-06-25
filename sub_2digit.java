public class sub_2digit{
  public static void main(String[] arg){
    int n = 6928;
    // 2 digit take;
    while(n>99){
      int rev = 0;
      int temp = n;
      while(temp > 0){
        rev = rev * 10 + temp % 10;
        temp /=10;
      }
      int result = 0;
      while(rev >= 10){
        int d1 = rev % 10;
        rev /= 10;
        int d2 = rev % 10;
        int diff;
        if(d1 > d2){
          diff = d1 -d2;
        }
        else
          diff = d2 - d1;
        result = result * 10 + diff;
      }
      n = result;
      System.out.println(n);
    }
    System.out.println("Final Output :" + n);

  }
}