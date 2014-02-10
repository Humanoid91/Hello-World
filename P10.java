class P10{
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
		long sum=2;
		for(int n=3;n<2000000;n+=2){
			if(isPrime(n)==1){
				sum+=n;
			}
		}
		System.out.println(sum);
		
	}
}