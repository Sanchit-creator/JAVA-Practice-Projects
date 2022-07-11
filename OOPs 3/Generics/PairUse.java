package Generics;

import Interface.vehicle;

public class PairUse {
    public static void main(String[] args) {

        // only for one type


        // Pair<String> p = new Pair<>();
        // p.setFirst("abc");
        // System.out.println(p.getFirst() + " " + p.getSecond());

        //int = primitive have value 
        // Interger = refreing which have that value

        // Pair<Integer> p = new Pair<Integer>(10, 20);

        //Type cast error
        // Pair p = new Pair(10, 20);
        // p.setFirst("aa");
        // p.setFirst(10);
        // String f = (String) p.getFirst();


        // System.out.println(p.getFirst() + " " + p.getSecond());
        // PairString pS = new PairString("aa", "bb");
        // PairDouble pS = new PairDouble(3.1, 7.2);

        // Pair<String> pS = new Pair<String>("aa", "bb");

        // you can write
        // Pair<String> pS = new Pair<>("aa", "bb");

        // System.out.println(pS.getFirst() + " " + pS.getSecond());
        // pS.setFirst("xyz");

        // Pair<Double> pd = new Pair<Double>(10.1, 20.6);
        // System.out.println(pd.getFirst() + " "+ pd.getSecond());

        // Pair<Integer> pi = new Pair<Integer>(10, 20);
        // System.out.println(pi.getFirst() + " " +pi.getSecond());

        // Pair of class

        // Pair<vehicle> pv = new Pair<vehicle>(new vehicle(), new vehicle());


        // for two type 

        Pair<String, Integer> psi = new Pair<String,Integer>("ab", 20);

    }
}
