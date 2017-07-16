/**
 * Do not change the first two 
 * lines of this program. They
 * are used to declare the Main
 * class and the main method. 
 */

public class Main {
        public static void main(String[] args) {
	    boolean a = true; /*true*/
	    boolean b = false; /*false*/
	    boolean c= !false; /*true*/
	    
	    boolean d = b && !c; /*false*/
	    boolean e = (c || d) || false; /*true*/
	    boolean f = !(b && c) && (true || (c && a)); /*true*/
	    boolean g = (a && b) || c && d || (e || f); /*true*/
	    
	    System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		System.out.println("e = "+ e);
		System.out.println("f = "+ f);
		System.out.println("g = "+ g);
	}
}