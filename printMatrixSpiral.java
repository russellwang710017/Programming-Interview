// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
import java.util.*;

public class printMatrixSpiral{
	public static void main(String[] args){
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		// System.out.println("Running");
		ArrayList<Integer> result = printSpiral(matrix);
		System.out.println(result);
		
		// int m = 3;
		// int n = 3;
		// int x = 0;
		// int y = 0;
		// while(m > 0 && n > 0){
		// 	//printing straight line
		// 	if(m == 1){
		// 		for(int i = 0; i < n; i++){
		// 			result.add(matrix[x][y++]);
		// 			break;
		// 		}
		// 	}else if(n == 1){
		// 		for(int i = 0; i < m; i++){
		// 			result.add(matrix[x++][y]);
		// 		}
		// 	}

		// 	//processing circle

		// 	//top-left to top-right
		// 	for(int i = 0; i < n-1; i++){
		// 		result.add(matrix[x][y++]);
		// 	}

		// 	//top-right to bottom-right
		// 	for(int i = 0; i < m-1; i++){
		// 		result.add(matrix[x++][y]);
		// 	}

		// 	//bottom-right to bottom-left
		// 	for(int i = 0; i < n-1; i++){
		// 		result.add(matrix[x][y--]);
		// 	}

		// 	//bottom-left to top-right
		// 	for(int i = 0; i < m-1; i++){
		// 		result.add(matrix[x--][y]);
		// 	}

		// 	m = m-2;
		// 	n = n-2;
		// 	x++;
		// 	y++;
		// }

		// System.out.println(result);
	}

	public static ArrayList<Integer> printSpiral(int[][] matrix){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int m = matrix.length;
		int n = matrix[0].length;
		int x = 0;
		int y = 0;

		while(m > 0 && n > 0){
			//printing straight line
			if(m == 1){
				for(int i = 0; i < n; i++){
					result.add(matrix[x][y++]);
					break;
				}
			}else if(n == 1){
				for(int i = 0; i < m; i++){
					result.add(matrix[x++][y]);
				}
			}

			//processing circle

			//top-left to top-right
			for(int i = 0; i < n-1; i++){
				result.add(matrix[x][y++]);
			}

			//top-right to bottom-right
			for(int i = 0; i < m-1; i++){
				result.add(matrix[x++][y]);
			}

			//bottom-right to bottom-left
			for(int i = 0; i < n-1; i++){
				result.add(matrix[x][y--]);
			}

			//bottom-left to top-right
			for(int i = 0; i < m-1; i++){
				result.add(matrix[x--][y]);
			}

			m = m-2;
			n = n-2;
			x++;
			y++;
		}

		return result;
	}
}