/**
 * Do not change the method or class
 * declarations.
 */

public class Main{

    /*
     * Returns an array with the quotient and remainder of the
     * integer division
     *
     * @param dividend a positive int
     * @param divisor a positive int
     */
    static int[] division(int dividend, int divisor){

	    int result[] = {0, dividend};
	
	    if ( dividend < divisor ){
	        return result;
	    }else{
	    int tmp = dividend - divisor;  
	    int[] whateva = division(tmp, divisor); 
	    result[0] = whateva [0]+1;
	    result[1] = whateva [1] ;
	        return result;
	    }
	
    }

    public static void main(String[] args){
	    int result[]=division(20,3);
	    System.out.println("Quotient: "+ result[0]
			   + " Remainder: "+ result[1]);
    }
}