package Day5Functional;
import java.util.Scanner;
	public class Print2DArray {
	    public static void main(String[] args) {

	        int row, col, result;
	        
	        int arr[][];
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the total number of row : ");
	        row = scanner.nextInt();
	        System.out.print("Enter the total number of column : ");
	        col = scanner.nextInt();

	        arr = new int[row][col];

	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
	                arr[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("You have entered the following array : ");

	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}