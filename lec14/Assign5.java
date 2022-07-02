public class Assign5 {
    public static boolean checkNumber(int input[], int x) {
		if(input.length==0){
            return false;
        }
        if(input[0]==x){
            return true;
        }
        int smallarray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallarray[i-1]=input[i];
        }
        boolean result=checkNumber(smallarray,x);
        return result;
	}
}
