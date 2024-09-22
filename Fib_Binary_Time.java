import java.io.IOException;
import java.io.PrintWriter;

public class Fib_Binary_Time {
	
	public static long fib_Binary(int num) {
		if(num <= 1) {
			return num;	
		}	
		else {
			long result = fib_Binary(num-1) + fib_Binary(num-2);
			return result;
		}	
	}
	
	public static void time() {
		try(PrintWriter file = new PrintWriter("out2.txt")){
			for(int i=5; i<=60; i+=5) {
				long time_start = System.nanoTime();
				long fib_result = fib_Binary(i);
				long time_end = System.nanoTime();
				long duration = time_end - time_start; 
						
				file.printf("Fibonacci(%d) is: %3d and Time Taken: %3d ms %n",i,fib_result,duration);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		time();
		System.out.println("Finished");
	}
}
