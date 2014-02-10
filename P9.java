class P9{
	public static void main(String[] args){
		for(int c=330;c<600;c++){
			for(int b=c-1;b>0;b--){
				if((1000-(b+c))*(1000-(b+c))+b*b==c*c){
					System.out.println((1000-(b+c))*b*c);
				}
			}
		}
	}
}