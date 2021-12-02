/* File: OBmulttable.java by Oluwakayikunmi Babatunde - Akinnagbe (OB)
Program: INTERVIEW question. "Write out to output on screen the results of a 12 by 12 multiplication table."
*/
public class OBmulttable 
{
    public static void main(String args[])
    {
        int a;
        int b;
        for (a=1; a<=12; ++a)
        {
            for (b=1; b<=12; ++b)
            {
                System.out.print(a*b+"\t");  
            }
            System.out.println();
        } 
      
    }
}
