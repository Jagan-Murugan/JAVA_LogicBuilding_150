public class arrange_odd {
  public static void main(String[] args){
  int n = 361589;
  int temp = n;
  int odd[] = new int[20];
  int even[] = new int[20];
  int od = 0, ev = 0;
  while(temp > 0){
    int digit = temp % 10;
    if(digit % 2 != 0){
      odd[od++]=digit;
    }
    else{
      even[ev++]=digit;
    }
    temp = temp / 10;
  }
  for(int i = od - 1; i >= 0;i--){
    System.out.println(odd[i]);
  }
  for(int j = ev - 1; j >= 0;j--){
    System.out.println(even[j]);
  }
  }  
  
}
