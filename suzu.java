package test;
public class Test2 {
	static int[] arr = {5,-3,2,4};
	static int maxIndex = arr.length - 1;

	public static void main(String[] args) {
		findMaxArr2();
		System.out.println("\n--------");
	}
	static void findMaxArr2() {
		int max = arr[0];
		int sum;
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i <= maxIndex; i++) {
			sum = 0;
			for (int j = i; j <= maxIndex; j++) {
				sum += arr[j];
				if (sum > max) {
					max = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("×î´óÖµ£º" + max);
		printArr(startIndex, endIndex);
	}
	
	static void printArr(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}