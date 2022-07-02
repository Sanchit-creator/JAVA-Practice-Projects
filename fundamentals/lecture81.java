public class lecture81 {
    public static boolean checkMember(int n){
        int a = 0;
        int b = 1;
        int c;
        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
    
    
}
Scanner s = new Scanner(System.in);
int n = s.nextInt();
