package week5.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			System.out.println(num);
			int a = num % 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.err.println("Divisible by 0 is not possible");
		} catch (InputMismatchException e){
			System.err.println("inputs must be a number");
		} catch (Exception e) {
			System.err.println("Unknown error");
		}finally {
			System.out.println("completed");
			sc.close();
		}
	}

}
