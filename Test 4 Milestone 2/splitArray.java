public class splitArray {
    public static boolean splitArray(int input[]) {
        return helper(input, 0, 0, 0);
	}
    public static boolean helper(int input[], int si, int ls, int rs) {
        if (si == input.length) {
            return ls == rs;
        }if (input[si] % 5 == 0) {
            ls += input[si]; 
        }else if (input[si] % 3 == 0) {
            ls += input[si];
        }else {
            boolean leftAns = helper(input, si+1, ls + input[si], rs);
            boolean rightAns = helper(input, si+1, ls, rs + input[si]);
            return leftAns || rightAns;
        }
        return helper(input, si + 1, ls, rs);
    }
    public static void main(String[] args) {
        int input[] = {1, 2};
        System.out.println(splitArray(input));
    }
}
