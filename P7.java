class P7{
	public static int isPrime(int n){
		if(n==2){
			return 1;
		}
		else{
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
					return 0;
				}
			}
			return 1;
		}
		
	}
	public static void main(String[] args){
		int count=0;
		int n=2;
		while(true){
			if(isPrime(n)==1){
				count++;
			}
			if(count==10001){
				System.out.println(n);
				break;
			}
			n++;
			
		}
	}
}