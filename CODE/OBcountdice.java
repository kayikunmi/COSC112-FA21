/* File: Hwk2/OBarrayrev.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Roll a die n=10 times. Report frequency of each integer 1-6. HINT: Lab5Sol/countDice.java
*/

public class OBcountdice 
{
    public static void main (String [] args) {
        System.out.println("How many rolls do you think it would take for you to get a triple?");
       
        int rand1 = (int)(Math.random () * 6) + 1;
        int rand2 = (int)(Math.random () * 6) + 1;
        int rand3 = (int)(Math.random () * 6) + 1;
        int rand4 = (int)(Math.random () * 6) + 1;
        int rand5 = (int)(Math.random () * 6) + 1;
        int rand6 = (int)(Math.random () * 6) + 1;
        int rand7 = (int)(Math.random () * 6) + 1;
        int rand8 = (int)(Math.random () * 6) + 1;
        int rand9 = (int)(Math.random () * 6) + 1;
        int rand10 = (int)(Math.random () * 6) + 1;
      
            
        System.out.println(rand1 + "-" + rand2 + "-" + rand3+ "-" + rand4+ "-" + rand5+ "-" + 
            rand6+ "-" + rand7+ "-" + rand8+ "-" + rand9+ "-" + rand10);
            
    }
    public static void count(int rand1) 
    {
		int countUpper = 0;
		int countLower = 0;
		for(int i=0; i<name.length(); i++) {
			if(Character.isUpperCase(name.charAt(i))) {
				countUpper++;
			}
			if(Character.isLowerCase(name.charAt(i))) {
				countLower++;
			}
		}
		System.out.print(name + " has " + countUpper + " uppercases and " + countLower + " lowercases.");
        System.out.println();
        System.out.println();
	}

}
