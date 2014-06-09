import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class P59 {

	
	public static void main(String[] args) {
		File file = new File("cipher1.txt");
		Scanner in;
		try {
			in = new Scanner(file);
			in.useDelimiter("\\D");
			//int a=0;
			//int i=0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while((in.hasNextInt())){
				list.add(in.nextInt());
				//System.out.println(list.size()+"lol");
				//System.out.println(list.size()+":"+list.get(i));
				//i++;
			}
			//char a='a',b='b';
			int sum=0;
			for(int j=0;j<list.size();j+=3){
				
				System.out.print((char)(list.get(j)^103));
				sum=sum+(list.get(j)^103);
				if(j+1<list.size()){
					System.out.print((char)(list.get(j+1)^111));
					sum=sum+(list.get(j+1)^111);
				}
				if(j+2<list.size()){
					System.out.print((char)(list.get(j+2)^100));
					sum=sum+(list.get(j+2)^100);
				}
							
			}
			System.out.println("\n"+sum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//(i=0;i<list.lastIndexOf(in))
		
		
	}

}
