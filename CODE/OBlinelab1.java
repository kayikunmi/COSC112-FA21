import java.util.*;
public class OBlinelab1 
{
    public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many underscores?");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) 
		{
			System.out.print("_");
		}	
		scan.close();
	}//main
}
