import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Type something here: ");
        String input =  sc.nextLine();
        if (StringUtils.isNumeric(input)) {
            System.out.println("You typed in a number!");
        } else {
            System.out.println("You typed in a string!");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reverse: " + StringUtils.reverse(input));



    }

}
