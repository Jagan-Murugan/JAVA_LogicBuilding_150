public class second_last {
  public static void main(String[] args) {
      int n = 4567;
      
      int last = n % 10;
      n = n / 10;
      int sec_last = n % 10;
      System.out.println(sec_last);

  }
  
}
