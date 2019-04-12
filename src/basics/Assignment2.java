package basics;

public class Assignment2 {

	public static void main(String[] args) {
		int n = 5;
		fact(n);
		System.out.println(fact(n));
	}
	public static int fact(int x) {
		if (x == 0) {
			return 1;
		}
		else if (x == 1) {
			return 1;
		}
		return (x *  fact(x-1));
	}
}

/* Solucion del curso
 
 public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    else if (n == 1) {
        return 1;
    }
    return factorial(n-1) * n;
}

====================================================

public static int fac(int n) {

if (n == 0) {

return 1;

}

return fac(n-1) * n;

}

*/