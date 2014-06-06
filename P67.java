import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P67 {

	

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("triangle.txt");
		Scanner in;
		in = new Scanner(file);
		int max=0;
		
		
		int[][] b = new int[100][];
		for(int i=0;i<100;i++){
			b[i]=new int[i+1];
			for(int j=0;j<=i;j++){
					b[i][j]=in.nextInt();
			}
		}	
		for(int i=0;i<99;i++){
			for(int j=0;j<=i+1;j++){
				if(i!=98){
					if(j==0){
						b[i+1][j]=b[i+1][j]+b[i][j];
					}
					else if(j==i+1){
						b[i+1][j]=b[i+1][j]+b[i][j-1];
					}
					else{
						if((b[i][j-1])>b[i][j]){
							b[i+1][j]=b[i+1][j]+b[i][j-1];
						}
						else{
							b[i+1][j]=b[i+1][j]+b[i][j];
						}
					}
				}
				else{
					if(j==0){
						b[i+1][j]=b[i+1][j]+b[i][j];
					}
					else if(j==i+1){
						b[i+1][j]=b[i+1][j]+b[i][j-1];
					}
					else{
						if((b[i][j-1])>b[i][j]){
							b[i+1][j]=b[i+1][j]+b[i][j-1];
						}
						else{
							b[i+1][j]=b[i+1][j]+b[i][j];
						}
					}
					if(b[i+1][j]>max){
						max=b[i+1][j];
					}
				}
			}
		}
		/*for(int i=0;i<100;i++){
			System.out.println(b[99][i]);
		}*/
		System.out.println(max);
		in.close();
		
	}

}
