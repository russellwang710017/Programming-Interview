/*Given an integer N, print N ladder
ex. N = 6
     #
    ##
   ###
  ####
 #####
######
*/

public class printNLadder{
	public static void main(String[] args){
		printLadder(6);
	}

	public static void printLadder(int N){
		int i, j;
		int length = N;

		for(i = 0; i < length; i++){
			for(j = 0; j < length - i - 1; j++){
				System.out.print(" ");
			}

			for(int k = 0; k < i + 1; k++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}