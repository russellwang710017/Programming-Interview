/*Given a m * n matrix, if an element is 0, set its entire row and column to 0.
Do it in place.*/
public class setMatrixZerosMethod{
	public static void main(String[] args){
		System.out.println("Running!");
		int[][] test = new int[4][4];
		test[0][0] = 1;
		test[0][1] = 1;
		test[0][2] = 1;
		test[0][3] = 0;
		test[1][0] = 1;
		test[1][1] = 1;
		test[1][2] = 1;
		test[1][3] = 1;
		test[2][0] = 1;
		test[2][1] = 1;
		test[2][2] = 0;
		test[2][3] = 0;
		test[3][0] = 1;
		test[3][1] = 1;
		test[3][2] = 0;
		test[3][3] = 0;

		setMatrixZero(test);
	}

	public static void setMatrixZero(int[][] array){
		boolean firstcolumnzero = false;
		boolean firstrowzero = false;

		//set firstcolumnzero
		for(int i = 0; i < array.length; i++){
			if(array[i][0] == 0){
				firstcolumnzero = true;
				break;
			}
		}

		//set firstrowzero
		for(int i = 0; i < array[0].length; i++){
			if(array[0][i] == 0){
				firstrowzero = true;
				break;
			}
		}

		//mark zero elements by using first column and row
		for(int i = 1; i < array.length; i++){
			for(int j = 1; j < array[0].length; j++){
				if(array[i][j] == 0){
					array[i][0] = 0;
					array[0][j] = 0;
				}
			}
		}

		//set corresponding element zero
		for(int i = 1; i < array.length; i++){
			for(int j = 1; j < array[0].length; j++){
				if(array[i][0] == 0 || array[0][j] == 0){
					array[i][j] = 0;
				}
			}
		}

		//set first column zero
		if(firstcolumnzero){
			for(int i = 0; i < array.length; i++){
				array[i][0] = 0;
			}
		}

		//set first row zero
		if(firstrowzero){
			for(int i = 0; i < array[0].length; i++){
				array[0][i] = 0;
			}
		}

		//printing the array
		for(int i = 0; i < array.length; i++){
			System.out.print("[ ");
			for(int j = 0; j < array[0].length; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println("]");
		}
	}
}