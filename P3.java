class P3{
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
		
		long n= 600851475143L;
		int i=(int)Math.sqrt(n);
		for(;i>1;i--){
			if(n%i==0&& isPrime(i)==1){
				System.out.println(i);
				return;
			}
		}
		
		
	}
}
