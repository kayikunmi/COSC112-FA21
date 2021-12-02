import java.util.*;

public class OBSet 
{
    public static void main(String [] args)
    {
        ArrayList <Integer> V = new ArrayList <> (Arrays.asList(3,5,3));
        System.out.println(V);
        System.out.println("The Array V Is Set to " + isSet(V));
    }

    public static boolean isSet (ArrayList <Integer> X)
    {
        for (int i = 0; i < X.size();)
        {
            if(X.subList(i+1, X.size()).contains(X.get(i)));
            return false;
        
        }
        return true;
    }
     
}
