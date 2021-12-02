import java.util.*;
public class mad 
{
    public static void main(String [] args)
    { 
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter color: ");
        String color = keyboardInput.nextLine();

        System.out.print("Enter plural noun: ");
        String pluralNoun = keyboardInput.nextLine();

        System.out.print("Enter celebrity: ");
        String celebrity = keyboardInput.nextLine();

        System.out.println("Roses are " + color);
        System.out.println(pluralNoun + " are blue");
        System.out.println("I love " + celebrity);
        keyboardInput.close();
    }

}
