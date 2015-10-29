/*
Problem: Rotate an array of n elements to the right by k steps. 
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
How many different ways do you know to solve this problem?
*/
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