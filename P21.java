class P21{
	public static int divisorSum(int n){
		int sum=1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(i==Math.sqrt(n)&& n%i==0){
				sum+=i;
			}
			else if(n%i==0){
				sum+=i+n/i;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		int[] a;
		a=new int[10001];
		int sum=0;
		//System.out.println(divisorSum(284));
		for(int i=1;i<=10000;i++){
			a[i]=divisorSum(i);
		}
		for(int i=1;i<=10000;i++){
			if(a[i]<=10000&&a[a[i]]==i&&a[i]!=i){
				sum+=i;
				System.out.println("i="+i+"\ta[i]="+a[i]);
			}
		}
		System.out.println(sum);
		
	}
}