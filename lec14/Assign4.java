public class Assign4 {
    public static int sum(int input[]) {
		if (input.length == 0) {
            return 0;
        }
        int smallarray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallarray[i-1]=input[i];
        }
        int sum=sum(smallarray);
        return input[0]+sum;
	}
}
