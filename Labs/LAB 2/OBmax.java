//file: Lab2/OBmax.java (Kayikunmi Babatunde - Akinnagbe)

import java.util.*;
public class OBmax {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        Scanner sin = new Scanner(System.in);

        int  num1 = 0;
        System.out.println("Enter num1 for the first number");
        num1 = cin.nextInt();//first number

        int num2 = 0;
        System.out.println("Enter num2 for the second number");
        num2 = sin.nextInt();//second number

        int max = Math.max(num1, num2);
        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + max);

    cin.close();
    sin.close();
    }
}
