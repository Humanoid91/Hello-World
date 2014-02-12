class P12{
	public static int checkDivisor(long n){
		int count=0;
		for(int i=1;i<=Math.sqrt(n);i++){
			if(i==Math.sqrt(n)&& n%i==0){
				count+=1;
			}
			else if(n%i==0){
				count+=2;
			}
		}
		if(count>500){
			System.out.println(n);
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){
		long n=0;
		//System.out.println("lol");
		for(int i=1;;i++){
			n=n+i;
			//System.out.println(n);
			if(checkDivisor(n)==1)
				return;
			
		}
	}
}