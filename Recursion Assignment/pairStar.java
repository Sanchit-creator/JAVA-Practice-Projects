public class pairStar {
    public static String addStar(String word) {
        if (word.length() == 1) {
            return word;
        }
        String smallOutput = addStar(word.substring(1));
        if (word.charAt(0) == smallOutput.charAt(0)) {
            smallOutput = word.charAt(0)+"*"+smallOutput;
            
        }else {
            smallOutput = word.charAt(0) + smallOutput;
        }
        return smallOutput;

    }
    public static void main(String[] args) {
        String word = "abbc";
        System.out.println(addStar(word));
    }
}
