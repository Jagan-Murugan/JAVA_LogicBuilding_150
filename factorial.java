public class factorial{
public static void main(String[] args){
  int n = 7;
  long fact = 1;
  for(int i = 1;i<=n;i++){
    fact *=i;
  }
  System.err.println(fact);

}
}