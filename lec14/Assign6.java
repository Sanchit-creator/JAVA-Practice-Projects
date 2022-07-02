public class Assign6 {
   

        public static int firstIndex(int input[], int x) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
              * Taking input and printing output is handled automatically.
            */
            if(input.length==0){
                return -1;
            }
            if(input[0]==x){
                return 0;
            }
            int smallarray[]=new int[input.length-1];
            for(int i=1;i<input.length;i++){
                smallarray[i-1]=input[i];
            }
            int ans=firstIndex(smallarray,x);
            if(ans==-1){
                return -1;
            }else{
                return ans+1;
            }
            
        }
        
    
}
