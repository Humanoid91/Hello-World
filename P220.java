
public class P220 {
	public static String getit (String a){
		StringBuilder b =new StringBuilder("");
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='a'){
				b.append("aRbFR");
			}
			else if(a.charAt(i)=='b'){
				b.append("LFaLb");
			}
			else {
				b.append(a.charAt(i));
			}
		}
		return b.toString();
	}
	public static void main(String[] args) {
		String d ="Fa";
		for(int j=1;j<8;j++){
			d=getit(d);
			//System.out.println(d+":"+j);
			
		}
		
		
			long count =0;
			int flag =3;
			int x=0,y=0;
			for(int i=0;i<1000;i++){
				if(d.charAt(i)=='F'){
					switch(flag){
					case 1: x+=1;break;
					case 2: x-=1;break;
					case 3: y+=1;break;
					case 4: y-=1;break;
					}
					count+=1;
					if(count==65){
						break;
					}
				}
				else if(d.charAt(i)=='L'){
					switch(flag){
					case 1: flag=3;break;
					case 2: flag=4;break;
					case 3: flag=2;break;
					case 4: flag=1;break;
					}
				}
				else if(d.charAt(i)=='R'){
					switch(flag){
					case 1: flag=4;break;
					case 2: flag=3;break;
					case 3: flag=1;break;
					case 4: flag=2;break;
					}
				}
			}
			//System.out.println(x+":"+y+":"+flag+":"+count+":"+d.length()+":"+j);
			
		//}
			System.out.println(x+":"+y+":"+flag);
	}

} 
