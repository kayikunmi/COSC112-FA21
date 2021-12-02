/* File: OBfilenames.java by Oluwakayikunmi Babatunde - Akinnagbe + partner AO Aidan Orr
Program:  Copy words from an Array into a LinkedList
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OBfilenames 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File ff = new File("names.txt");
        Scanner keyboard = new Scanner(ff);
        LinkedList<String> list = new LinkedList<>();
        while(keyboard.hasNextLine())
        {
            list.add(keyboard.next());
        }
        System.out.println("The list of names in the file: " + list);
        Collections.sort(list);
        System.out.println("The list in alpahbetical order: " + list);
        keyboard.close();
    }
}