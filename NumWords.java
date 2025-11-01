// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int hundreds = (num%1000)/100; //It can only be divided by 100, but in order to cover cases where the input is greater than 3 digits, we will use its module earlier.
		int tens = (num/10)%10;
		int ones = num%10;
		System.out.println(hundreds+" hundreds, "+tens+" tens, and "+ones+" ones.");
}
}
