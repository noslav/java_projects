/**
 * Do not change the method or class
 * declarations.
 */


public class Main{
    
    /* 
     * Look at what is happening with the strings
     */
    static String assignAuthor(String sentence, String author){

	    sentence = sentence + " Author: " +author;

	    System.out.println("The sentence is: "+ sentence);
	    return sentence;
    }

    
    public static void main(String[] args){
	
	    String sentence = "Veni, vidi, vici";
	    String author = "Julius Caesar";
	
	    System.out.println("The sentence is: "+ sentence);
	    System.out.println("The author is: "+ author);
	    sentence = assignAuthor(sentence, author);
	    
	    System.out.println("The sentence is: "+ sentence);

    }

}