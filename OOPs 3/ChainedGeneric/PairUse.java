package ChainedGeneric;

public class PairUse {
    public static void main(String[] args) {
        Pair<String, Integer> pInner = new Pair<String, Integer>("ab", 100);
        Pair<Pair<String, Integer>, String> p= new Pair<>();
        p.setFirst(pInner);
        System.out.println((p.getFirst().getFirst()));
        System.out.println((p.getFirst().getSecond()));
        System.out.println(p.getFirst());
        p.setSecond("abc");
        System.out.println(p.getSecond()); 
    }
}
