// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill = Integer.parseInt(args[3]);
		double pay = Math.ceil((double)bill/3);
		System.out.println("Dear "+name3+", "+name2+", and "+name1+": pay "+pay+" Shekels each.");
	}
}
