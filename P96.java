import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P96 {
	static int sum=0;
	public static void printArray(int[][] mat){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(mat[i][j]);
			}
			//System.out.println("lol");
			System.out.println();
			
		}
	}
	public static void printArrayBool(boolean[][] mat){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(mat[i][j]);
			}
			//System.out.println("lol");
			System.out.println();
			
		}
	}
	public static boolean check(int[][] mat,int a,int i,int j){
		
		for(int k=0;k<9;k++){
			if(mat[i][k]==a){
				return false;
			}
		}
		for(int k=0;k<9;k++){
			if(mat[k][j]==a){
				return false;
			}
		}
		if(i==0 || i==3|| i==6){
			if(j==0 || j==3|| j==6){
				for(int k=i;k<=i+2;k++){
					for(int l=j;l<=j+2;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
			else if(j==1 || j==4|| j==7){
				for(int k=i;k<=i+2;k++){
					for(int l=j-1;l<=j+1;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
			else if(j==2 || j==5|| j==8){
				for(int k=i;k<=i+2;k++){
					for(int l=j-2;l<=j;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
		}
		else if(i==1 || i==4|| i==7){
			if(j==0 || j==3|| j==6){
				for(int k=i-1;k<=i+1;k++){
					for(int l=j;l<=j+2;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
			else if(j==1 || j==4|| j==7){
				for(int k=i-1;k<=i+1;k++){
					for(int l=j-1;l<=j+1;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
			else if(j==2 || j==5|| j==8){
				for(int k=i-1;k<=i+1;k++){
					for(int l=j-2;l<=j;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
		}
		else if(i==2 || i==5|| i==8){
			if(j==0 || j==3|| j==6){
				for(int k=i-2;k<=i;k++){
					for(int l=j;l<=j+2;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
			else if(j==1 || j==4|| j==7){
				for(int k=i-2;k<=i;k++){
					for(int l=j-1;l<=j+1;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
			else if(j==2 || j==5|| j==8){
				for(int k=i-2;k<=i;k++){
					for(int l=j-2;l<=j;l++){
						if(mat[k][l]==a){
							return false;
						}
					}
				}
			}
		}
		return true;
		
	}
	public static void solveGrid(int[][] mat,boolean[][] bool,int row,int col){
		//boolean b = true;
		if(row== 9 && col ==0){
			//printArray(mat);
			sum+=mat[0][0]*100+mat[0][1]*10+mat[0][2];
			//System.out.println(sum);
			return;
		}
		int a=1;
		while(a<10){
			//System.out.println(check(mat,a,row,col));
			if((check(mat,a,row,col) ||  bool[row][col])){
				if(bool[row][col]==false){
					mat[row][col]=a;
				}
				if(col<8){
					solveGrid(mat,bool,row,col+1);
					//System.out.println("lol");
				}
				else{
					//printArray(mat);
					solveGrid(mat,bool,row+1,0);
				}
				
				if(bool[row][col]==false){
					mat[row][col]=0;
				}
			}
			else if (a==9 && (check(mat,a,row,col))){
				//System.out.println("a:"+a+"row:"+row+"col:"+col);
				return;
			}
			if(bool[row][col]==true)
				return;
			a++;
			 
		}
		//printArray(mat);
		
		
		//mat[0][0]=4;
		/*for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(mat[i][j]==0){
					for(a=1;a<10;a++){
						b=check(mat,a,i,j);
						if(b==true){
							matrix[i][j]=a;
							break;
						}
					}
				}
				else{
					matrix[i][j]=mat[i][j];
				}
			}
		}*/
		
		
		
	}
	public static void main(String[] args) {
		File file = new File("sudoku.txt");
		Scanner in;
		int[][] a=new int[9][9];
		boolean[][] bool= new boolean[9][9];
		try {
			in = new Scanner(file);
			for(int i=0;i<50;i++){
				in.nextLine();
				for(int j=0;j<9;j++){
					String string=in.nextLine();
					//System.out.println(string);
					for(int k=0;k<9;k++){
						a[j][k]=(int)string.charAt(k)-'0';
						if(a[j][k]==0){
							bool[j][k]=false;
						}
						else{
							bool[j][k]= true;
						}
					}
				}
				//printArray(a);
				//printArrayBool(bool);
				//solveGrid(a);
				solveGrid(a,bool,0,0);
				//printArray(solveGrid(a));
				System.out.println();
				
			}
			System.out.println(sum);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
