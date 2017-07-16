public class Main 
{

	public static void main(String[] args) 
	{
		int number = 28;
		int count = 0;
		for(int factor=2; factor<= number ; factor++)
		{
		    while(number % factor == 0)
		    {
		        number = number /factor;
		        count++;
		        if(count == 1)
		        {
		        System.out.print(factor+ ",");
		        }
		    }
		    
		    count = 0;
		}
	}
}
