
public class ASMain {
	
	public static void bubbleSort(int[] ar) {
		int temp = 0;
		
		for (int i=0; i<ar.length-1; i++) {
			
			if (ar[i] > ar[i+1]) {
				temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = {1012, 2, 11, 124,1353,123421,5432};
		
		bubbleSort(ar);
		
		for (int i : ar) {
			System.out.println(i);
		}
	}

}
