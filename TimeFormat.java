// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); //hh
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); //mm
        int h;
		String m;
		if (0<(12-hours) && (12-hours)<=12) {
			h = hours; 
			if (0<=minutes && minutes<=9) {
				m = "0"+minutes;
				System.out.println(h+":"+m+" AM");
			} else if (10<=minutes && minutes<=59) {
				m = ""+minutes;
				System.out.println(h+":"+m+" AM");
			}
		} else if ((12-hours)<=0) {
			h = -1*(12-hours);
			if (hours==12) {
				h = 12;
			}
			if (0<=minutes && minutes<=9) {
				m = "0"+minutes;
				System.out.println(h+":"+m+" PM");	
			} else if (10<=minutes && minutes<=59) {
				m = ""+minutes;
				System.out.println(h+":"+m+" PM");	
			}		
		}
	}
}


// Great
// Things to pay attention to: 
// Minutes behave the same for both 'PM' and 'AM', so instead of having ode duplicate for calculating the minutes, you can handle the 'AM' ' PM' issue and then add the minutes logic. 
// Instead of checking negative numbers (which might be not fun sometimes) like here -
// `else if ((12-hours)<=0)`
// you can check the other way around: if (hours - 12 >= 12)

