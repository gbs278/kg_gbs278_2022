package main

import (
	"fmt"
)

func main() {
	// store the strings in an array
	number := [10]string{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}
	// call driver
	driver(number)

}
func driver(numbers [10]string) {

	var input_1 int
	var input_2 int
	var input_3 int
	// going under the assumption that exactly 3 inputs will be given ON THE SAME LINE
	// ask user to give input
	fmt.Print("Please Provide numbers seperated by spaces: ")
	// scan
	fmt.Scanf("%d %d %d", &input_1, &input_2, &input_3)
	// pass each input to the input() function
	input(numbers, input_1)
	input(numbers, input_2)
	input(numbers, input_3)
	fmt.Printf("\n")

}

func input(numbers [10]string, given int) {
	temp := given
	// create string to hold the strings
	var hold_nums []string
	flag := false // will be switched to false if the temp (or 'given') is a negative number
	if temp < 0 {
		flag = true
		temp = 0 - temp // flip temp from negative to positive

	}
	if temp == 0 {
		fmt.Printf(numbers[0] + " ")
		return
	}

	for temp > 0 { // loop
		// add corresponding string to the hold_nums array
		hold_nums = append(hold_nums, numbers[temp%10])
		// make temp smaller and smaller
		temp = temp / 10

	}
	if flag { // if temp is negative, add negative to the hold_nums array
		hold_nums = append(hold_nums, "Negative")
	}
	output(hold_nums)
}
func output(hold_nums []string) {
	// print out everything
	for i := len(hold_nums) - 1; i > -1; i-- {
		fmt.Print(hold_nums[i])
	}
	fmt.Print(",")
}
