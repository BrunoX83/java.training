package basics;

public class Assignment3 {

	public static void main(String[] args) {
		int[] numbers = {0, 5, 10, 15, 20}; // defining items of the array
		int n = numbers.length; 			// total items of the array
		
		System.out.println(max(numbers));
		System.out.println(min(numbers));
		System.out.println(avg(numbers, n)); 
	}

	public static int min(int[] numbers){
		//  min array value 
		int minValue = numbers[0];			// minValue = first array value
		for(int i=1;i<numbers.length;i++){	// defining i var, looping while i<the last array item, increasing value to move within array
			if(numbers[i] < minValue){		// if array item value is lower than the first value we took then we pass that value to minValue
				minValue = numbers[i];		// we get the min Value
			}
		}
		return minValue;
	}
	
	public static int max(int[] numbers){
		// max array value 
		int maxValue = numbers[0];			// maxValue = first array value
		for(int i=1;i<numbers.length;i++){	// defining i var, looping while i<the last array item, increasing value to move within array
			if(numbers[i] > maxValue){		// if array item value is higher than the first value we took then we pass that value to maxValue
				maxValue = numbers[i];		// we get the max Value
			}
		}
		return maxValue;
	}
	
    static double avg(int a[], int n)  { 
        // sum of array element 
        int sum = 0; 
          
        for (int i = 0; i < n; i++) 		// defining i var at 0, loop while i < n (array item count), we increase i value 
            sum += a[i];                    // we add up each array item value to sum 
        return sum / n; 					// we divide the sum of the value among the total array item count
    } 	
}


/* Solucion del Curso
 * 
public static int findMax(int[] arr) {
int max = arr[0];
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
return max;
}

public static int findMin(int[] arr) {
int min = arr[0];
for (int i = 0; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}
return min;
}

public static int findAvg(int[] arr) {
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}
return sum / arr.length;
}

============================================================


*/
