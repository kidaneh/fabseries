package fibonacci;

public class fibonser {

	public static void main(String[] args) {
		
		 int count = 12, num1 = 0, num2 = 1;
	        System.out.println("Fibonacci Series of "+count+" numbers:");

	        for (int i = 1; i <= count; ++i)
	        {
	            System.out.print(num1+" ");

	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
	            int nextnum = num1 + num2;
	            num1 = num2;
	            num2 = nextnum;
	        }
	    }
	}
