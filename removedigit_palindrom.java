/*
38. Remove One Digit to Form Palindrome
Example Input
1234321

Remove one digit at a time:

Remove 1 → 234321 ❌
Remove 2 → 134321 ❌
Remove 3 → 124321 ❌
Remove 4 → 123321 ✅
Output
4
Another Example

Input:

1235321

Try deleting:

1 → 235321 ❌
2 → 135321 ❌
3 → 125321 ❌
5 → 123321 ✅

Output:

5
Best Approach

✔ Remove each digit and check palindrome.

Time Complexity: O(N²)
*/

public class removedigit_palindrom {

    static boolean ispalondrom(String s){
    int left = 0, right = s.length()-1;
    while(left<right){
      if(s.charAt(left) != s.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
  public static char findDigit(String s){
  for(int i = 0;i < s.length();i++){
    String temp = s.substring(0,i)+
    s.substring(i+1);
    if(ispalondrom(temp))
      return s.charAt(i);
  }
return '-';  
}
   public static void main(String[] args) {
        String s = "1234321";
        System.out.println(findDigit(s));
    } 
}
