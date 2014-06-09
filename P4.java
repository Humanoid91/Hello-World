class P4{
	public static int isPalindrome(int n){
		String temp=Integer.toString(n);
		int j=temp.length()-1;
		for(int i=0;i<=j/2+1;i++,j--){
			if(temp.charAt(i)!=temp.charAt(j)){
				return 0;
			}
		}
		return 1;
		
	}
	public static void main(String[] args){
		int max=1,a;
		for(int i = 999;i>100;i--){
			for(int j=i;j>100;j--){
				a=i*j;
				if(isPalindrome(a)==1&&a>max){
					max=a;
					
				}
			}
		}
		System.out.println(max);
	}
}