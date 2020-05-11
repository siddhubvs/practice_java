public class EvenDigitSum {
    	public static int getEvenDigitSum(int number) {
		if (number < 0)
			return -1;
 
		int n = number;
		int remainder = 0;
		int reversedN = 0;
		int total = 0;
		if (number < 0)
			return -1;
 
		while (n != 0) {
 
			remainder = n % 10;
			if ((remainder % 2) == 0)
				total += remainder;
 
			reversedN = reversedN * 10 + remainder;
			n = n / 10;
		
		}
		return total;
}
}
