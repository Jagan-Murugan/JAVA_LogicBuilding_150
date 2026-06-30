/*
36. Find Password (stable unstable):
Definition

A number is stable if all digits occur the same number of times.

Example Input
Array = {122, 1313, 456, 898}
Step 1: Check each number
Number	Digit Frequency	Stable?
122	1→1, 2→2	❌ Unstable
1313	1→2, 3→2	✅ Stable
456	4→1,5→1,6→1	✅ Stable
898	8→2,9→1	❌ Unstable
Step 2
Maximum unstable = 898
Minimum unstable = 122
Output
Password = 898 + 122 = 1020
Best Approach

✔ Count digit frequencies using an array of size 10.

Time Complexity: O(N × digits)
*/
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
