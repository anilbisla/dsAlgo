package gitHub;
import java.util.ArrayList;
import java.util.List;

public class GetPrimeFactors {
	public static void main(String[] args) {
		int num = 38400;

		List<Integer> primeFactors = getPrimeFactors(num);

		System.out.println("Prime Factors of [" + num + "] are:" + primeFactors);
	}

	private static List<Integer> getPrimeFactors(int num) {
		List<Integer> factors = new ArrayList<>();
		
		// number of 2's that divide num
		while (num % 2 == 0) {
			factors.add(2);
			num /= 2;
			//System.out.println(2);
		}
		
		int sqrtNum = (int) Math.sqrt(num);
		//System.out.println("sqrtNum::" + sqrtNum);
		// num is odd now and can be checked by i+=2
		int i = 3;
		while (i < sqrtNum) {
			while (num % i == 0) {
				factors.add(i);
				num /= i;
				//System.out.println(i);
			}
			i += 2;
			//System.out.println("Checking"+i);
		}
		// case when num is prime greater than 2
		if(num>2) {
			factors.add(num);
		}
		//System.out.println(factors);
		return factors;
	}

}
