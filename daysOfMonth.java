/**
 * Do not change the first two 
 * lines of this program. They
 * are used to declare the Main
 * class and the main method. 
 */
 
public class Main {

	public static void main(String[] args) {
		int m = 11;
		int d = 0;
		int y = 1990;
		if(m == 4 || m == 9 || m==6 || m==11)
		{
		    d = 30;
		}
		else if(m == 2)
		{
		    d = 28;
		}
		else
		{
		    d = 31;
		}
		if(m== 2 && (y %4 == 0 && y %100 !=0))
		{
		    d = 29;
		}
		
		System.out.println("In "+y+", the month "+m+" has "+d+" days");
	}
}
