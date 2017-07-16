
public class Main {

    public static void main(String[] args) {
        int a = 4;
        System.out.println("This is a test for number "+a);
        int b = square(a);
        int c = cube(a);
        int d = quad(a);
        System.out.println("a squared is "+ b);
        System.out.println("a cubed is "+ c);
        System.out.println("a quad is " + d);
        
    }
    
    public static int square(int x){
        return x*x;
    }
    //Complete the cube method. Try to use the square method.
    //Test your solution with the test button
    public static int cube(int z){
        z = square(z)*z;
        return z;
    }
    
    public static int quad(int z1){
        z1 = cube(z1)*z1;
        return z1;
    }
    
}
