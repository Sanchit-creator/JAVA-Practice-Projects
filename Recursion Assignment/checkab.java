public class checkab {
    public static boolean checkAB(String input) {
		// Write your code here
        if(input.length() == 0){
            return true;
        }
        
      if(input.charAt(0) == 'a'){
          if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){
              boolean ans=checkAB(input.substring(3));
              return ans;
          }else{
               boolean ans= checkAB(input.substring(1));
              return ans;
          }
      }else{
         return false; 
      }
	}
    

    public static void main(String[] args) {
        String input = "abb";
        System.out.println(checkAB(input));
    }
}
