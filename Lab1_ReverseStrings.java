import java.util.Scanner;

public class Lab1_ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            if ("end".equals(line)){
                break;
            }
            String reversed = new StringBuilder(line).reverse().toString();
            System.out.println(line + " = " + reversed);
        }
        sc.close();
    }
}
