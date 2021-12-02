/* File: OBmagic.java by Oluwakayikunmi Babatunde - Akinnagbe (OB)
Program: INTERVIEW question. Write a program that checks if a Mrix is a Magic square.
*/

public class OBmagic
{
    static int num = 3;
    public static void main(String[] args)
    {
        int M[][] = {{ 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 }};
     
        System.out.println();

        
        if (isMagicSquare(M))
            System.out.println("This array of numbers " + " is a Magic Square");
        else
            System.out.println("This array of numbers " + " is Not a Magic Square");
        System.out.println();
    }
   

    
    static boolean isMagicSquare(int M[][])
    {
        int diag1 = 0,diag2=0;
        for (int i = 0; i < num; i++)
        { 
            diag1 += M[i][i];
            diag2 += M[i][num-1-i];
        }
    
        if(diag1!=diag2)
            return false;
 
    
        for (int i = 0; i < num; i++) 
        {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < num; j++)
            {
                rowSum += M[i][j];
                colSum += M[j][i];
            }
            if (rowSum != colSum || colSum != diag1)
                return false;
        }
 
 
        return true;
    }

}