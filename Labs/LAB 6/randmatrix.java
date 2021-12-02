/* File: randmatrix.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Generate and display a matrix 3 x 3 with 0 and 1 randomly. HINT: Lab6Sol/RandMatrix.java
*/
public class randmatrix 
{
    public static void main(String[] args) 
    {
        int[][] A =new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                A[i][j]= (int) (Math.random ()*2);
                System.out.print(A[i][j]+"\t");
            }
        }
    }
}

