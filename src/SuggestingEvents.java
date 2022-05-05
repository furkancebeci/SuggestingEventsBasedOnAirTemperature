import java.util.Scanner;

public class SuggestingEvents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the air temperature: ");
        int temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You should ski");
        } else if (temperature >= 5 && temperature < 15) {
            System.out.println("You should go to the cinema");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("You should go on a picnic");
        } else if (temperature >= 25) {
            System.out.println("You should go swimming");
        }

    }
}
