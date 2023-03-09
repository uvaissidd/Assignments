package Exceptions;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String age) {
		super(age);
	}
}