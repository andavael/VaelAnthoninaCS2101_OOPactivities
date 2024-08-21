public class Escseq {
    public static void main(String[] args) {
        int number = 7;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("\t" + number);
            } 
            else {
                System.out.println(number);
            }
            
            number += 7;
        }
    }
}