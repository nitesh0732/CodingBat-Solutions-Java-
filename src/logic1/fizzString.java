package logic1;

/**
 * Given a string str, if the string starts with "f" return "Fizz". If the
 * string ends with "b" return "Buzz". If both the "f" and "b" conditions are
 * true, return "FizzBuzz". In all other cases, return the string unchanged.
 * (See also: FizzBuzz Code)
 * 
 * fizzString("fig") → "Fizz" fizzString("dib") → "Buzz" fizzString("fib") →
 * "FizzBuzz"
 */
public class fizzString {
	public String fizzString(String str) {
		int len = str.length();
		if ((str.substring(0, 1).equals("f")) && (str.substring(len - 1).equals("b")))
			return "FizzBuzz";
		if (str.substring(0, 1).equals("f"))
			return "Fizz";
		if (str.substring(str.length() - 1).equals("b"))
			return "Buzz";

		else
			return str;
	}

}
