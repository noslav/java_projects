public class Car {
	
        String color;
	boolean lights;

	public Car(String c, boolean l){
	   color =c; 
	   lights = l; 
	   if(l==true){
	       System.out.println("lights on");
	   }
	   else{System.out.println("lights off");
	   }
	}
	
	public void printCarInformation(){
	    String state = "";
	    if(lights){
	        state = "on";
	    }else{
	        state = "off";
	    }
	    System.out.println("This car is "+color+" and lights are "+state);
	}
	
	
	public static void main(String[] args) {
		Car c = new Car("green",true);
		System.out.println("We have created a car!");
		c.printCarInformation();
	}
}