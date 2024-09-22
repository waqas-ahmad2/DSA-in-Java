import java.io.IOException;
import java.io.PrintWriter;

public class Fib_Linear_Time {
	
	public static long[] fib_Linear(int num) {
		if(num <= 1) {
			long [] result = {num,0};
			return result;	
		}	
		else {
			long [] fib_call = fib_Linear(num-1);
			long [] result = {fib_call[0] + fib_call[1],fib_call[0]};
			return result;
		}	
	}
	
	public static void time() {
		try(PrintWriter file = new PrintWriter("out.txt")){
			for(int i=5; i<=100; i+=5) {
				long time_start = System.nanoTime();
				long[] fib_result = fib_Linear(i);
				long time_end = System.nanoTime();
				long duration = time_end - time_start; 
						
				file.printf("Fibonacci(%d) is: %3d and Time taken: %3d ms %n",i,fib_result[0],duration);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		time();
	}
}
