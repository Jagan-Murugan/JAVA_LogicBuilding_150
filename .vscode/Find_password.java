
public class Find_password {

  static boolean isstable(int n){
    int[] freq = new int[10];
    while(n > 0){
      freq[n % 10]++;
      n /= 10;
    }
    int count = 0;
    for(int i =0 ;i < 10;i++){
      if(freq[i] != 0){
      if(count == 0){
        count = freq[i];
      }
      else if(count != freq[i]){
        return false;
      }
    }
  }
    return true;
  }
  public static int findpassword(int[] arr){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int x : arr){
      if(!isstable(x)){
        min = Math.min(min,x);
        max = Math.max(max,x);
      }
    }
    return min+max;
  }
  public static void main(String[] args){
    int[] arr = {122, 1313, 456, 898};
    System.out.println("Find Password :"+findpassword(arr));
  }
  
}
