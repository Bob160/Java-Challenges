import java.util.Scanner;


public class algoReversal {
    public static String stringReversal(String input) {
        Scanner collectName = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String vocab = collectName.nextLine();
        StringBuilder sb = new StringBuilder(vocab);
        sb.reverse();
        return sb.toString();
    }
}

