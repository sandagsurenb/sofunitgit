import java.util.Scanner;

public class Lab2_RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        StringBuilder output = new StringBuilder();

        for (String word: words) {
            output.append(word.repeat(word.length()));
        }
        System.out.println(output);
        scan.close();
    }
}
