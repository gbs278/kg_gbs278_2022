import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// save the numbers as strings in the nums array
		String[] nums = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		driver(nums); // call driver() function
				
		}
	
	public static void driver(String[] nums ) {
		int input_1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Provide numbers seperated by spaces: "); 
		while(true) { // this loop goes until there's nothing left on the line
		// there can be as many inputs as desired
			if(!scanner.hasNextInt()) { 
				break;
			}
			input_1 = scanner.nextInt();
			input(nums,input_1); // call the input() function
		}
		
			
		
	}
	public static void input(String[] nums , int given) {
		int temp = given; // save given to temp
		ArrayList<String> hold_nums = new ArrayList<String>();
		boolean flag = false;
		if (temp < 0) { // if temp is negative, flip temp from negative to postive and set flag
			flag = true;
			temp = 0 - temp;
		}
		if (temp == 0) {
			System.out.print(nums[0] + " ");
			return;
		}
		while(temp > 0) { // while until temp is 0 or less
			hold_nums.add(nums[temp%10]); // add corresponding number to hold_nums
			temp /=10; // make temp smaller 
		}
		if (flag) { // if temp is negative, add "negative" to hold_nums
			hold_nums.add("Negative");
		}
		output(hold_nums); // call the output() method
			
	}
	public static void output(ArrayList<String> hold_nums) {
		// print out everything
		for(int i = hold_nums.size()-1; i > -1; i--) {
			System.out.print(hold_nums.get(i));
		}
		System.out.print(",");
			
		
	}
}


