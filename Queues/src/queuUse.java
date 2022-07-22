public class queuUse {
    public static void main(String[] args) {
        // queuArray queu = new queuArray();

        queuUsingLL<Integer> queu = new queuUsingLL<>();
        int arr[] = {1,2,3,4,5,6};
        for (int elem : arr) {
            // try {
                queu.enqueu(elem);
            // } catch (Exception e) {
            //     //TODO: handle exception

            // }
        }

        while (!queu.isEmpty()) {
            try {
                System.out.println(queu.dequeu());
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
