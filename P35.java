class P35{
	public static int isPrime(long n){
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
	public static boolean circular(int n){
		String a=Integer.toString(n);
		int c;
		for(int i=0;i<(a.length())-1;i++){
			a=a.substring(1)+a.charAt(0);
			c=Integer.parseInt(a);
			if(isPrime(c)==0){
				return false;
			}
		}
		return true;
		
		
	}
	public static void main(String[] args){
		int count=1;
		for(int i=3;i<1000000;i+=2){
			if(isPrime(i)==1){
				if(circular(i)==true){
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}