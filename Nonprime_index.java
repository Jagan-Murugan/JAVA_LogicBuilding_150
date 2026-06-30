/*
37. Sum of Non-Prime Index Values
Example Input
Array = [10,20,30,40,50,60,70]

Indexes:

Index	Value	Prime Index?
0	10	No
1	20	No
2	30	Yes
3	40	Yes
4	50	No
5	60	Yes
6	70	No
Add only non-prime indexes
10 + 20 + 50 + 70
Output
150
Step-by-step
sum=0

i=0 → sum=10
i=1 → sum=30
i=2 → skip
i=3 → skip
i=4 → sum=80
i=5 → skip
i=6 → sum=150
Best Approach

✔ Create an isPrime() function.

Time Complexity: O(N√N)
*/

public class Nonprime_index {
  static boolean isprime(int n){
    if(n < 2){
      return false;
    }
    for(int i = 2;i * i<=n;i++){
      if(n % i ==0){
        return false;
      }
    }
    return true;
  }
public static int sum(int []arr){
  int ans = 0;
  for(int i = 0;i < arr.length;i++){
    if(!isprime(i)){
      ans += arr[i];
    }
  }
return ans;
}
  public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println(sum(arr));
    }
}
