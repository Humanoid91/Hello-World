import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P96 {
	public static void printArray(int[][] matrix){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(matrix[i][j]);
			}
			//System.out.println("lol");
			System.out.println();
			
		}
	}
	public static int[][] solveGrid(int[][] mat){
		boolean[] b = new boolean[9];
		System.out.println(b[3]);
		
		return mat;
		
	}

	public static void main(String[] args) {
		File file = new File("sudoku.txt");
		Scanner in;
		int[][] a=new int[9][9];
		
		try {
			in = new Scanner(file);
			for(int i=0;i<1;i++){
				in.nextLine();
				for(int j=0;j<9;j++){
					String string=in.next();
					//System.out.println(string);
					for(int k=0;k<9;k++){
						a[j][k]=(int)string.charAt(k)-'0';
					}
				}
				
				solveGrid(a);
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
