public class fibonacci{
public static void main(String[] args) {
  int n = 7;
  int a = 0,b = 1;
  if(n == 0){
    System.out.print(a);
  }
  else if(n==1)
  System.out.print(b);
else{
  for(int i = 2;i<=n;i++){
    int c = a + b;
    a = b;
    b = c; 
  }
  System.out.println(b);
}
  
}
}
