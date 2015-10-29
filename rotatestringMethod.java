public class rotatestringMethod{
	public static void main(String[] args){
		int[] test = {1, 2, 3, 4, 5, 6, 7};
		rotatestring(test, 3);
		System.out.println("Running!");
	}

	public static void rotatestring(int[] array, int k){
		int[] copy = new int[array.length];
		//copy the array over
		for(int i = 0; i < array.length; i++){
			copy[i] = array[i];
		}

		//shifting
		for(int i = 0; i < array.length; i++){
			int pos = (i+k)%array.length;
			array[pos] = copy[i];
		}

		//printing the array
		System.out.print("[ ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
}