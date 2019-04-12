package basics;

public class Assignment1 {
	
	public static void main(String[] args) {

	int n = 8;
	sum(n);
	System.out.println(sum(n));
	}

	public static int sum(int i) {
		int x = 0;
		x = i;
		do {
			i--;
			x = x + i;
		} while (i !=0);
		 return x;
	}
}

/* solucion del curso

public static int sum(int[] numbers) {
    int sum=0;
    for (int i = 0; i < numbers.length; i++) {
        sum=sum+numbers[i];
    }
    return sum;
}
=========================================================================
System.out.println(sum(3));

public static int sum(int n){
	int sum = 0;
	for (int i= 1; i <=n; i++) {
		System.out.print(sum + " + " + i);
		sum = sum + i;
		System.out.print(" = " + sum);
	}
	return sum;
}

=========================================================================

public static int sumOfSequence(int n) {

if (n == 1 ) {

return 1;

}

return n + sumOfSequence(n - 1);

}

*/