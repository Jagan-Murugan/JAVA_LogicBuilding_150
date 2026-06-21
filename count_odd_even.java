public class count_odd_even{
  public static void main(String[] args) {
   int odd = 0,even = 0;
   for(int i=0;i<5;i++){
     int []n = {22,55,65,90,23};
    if(i % 2 != 0){
      odd++;
    }
    else{
      even++;
    }
   }  
   System.out.println("ODD COUNT :"+ odd);
   System.out.println("EVEN COUNT :" + even); 
  }
  
}
