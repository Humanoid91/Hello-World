
class Dice{
	
	private int ID;
	public Dice(int iD) {
		ID = iD;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public static int rollDice(){
		
		return (int) (Math.random()*6+1);
	}
}

public class P227 {

	public static void main(String[] args) {
		Dice d1=new Dice(1);
		Dice d2=new Dice(51);
		int count,c;
		long sum=0;
		int ones =0;
		int twos=0;
		long start=System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			count=0;
			
			while(d1.getID()!=d2.getID()){
				//a rolls
				c=Dice.rollDice();
				if(c==1){
					ones++;
				}
				if(c==2){
					twos++;
				}
				//System.out.print(c);
				switch(c){
				case 1: if(d1.getID()!=100) d1.setID(d1.getID()+1);else d1.setID(1);
						break;
				case 6: if(d1.getID()!=1) d1.setID(d1.getID()-1);else d1.setID(100);
						break;
				default: break;
				}
				c=Dice.rollDice();
				//System.out.print(c);
				//b rolls
				switch(c){
				case 1: if(d2.getID()!=100) d2.setID(d2.getID()+1);else d2.setID(1);
				break;
				case 6: if(d2.getID()!=1) d2.setID(d2.getID()-1);else d2.setID(100);
				break;
				default: break;
				}
				
				count++;
				
			}
			//System.out.println(count);
			//System.out.println();
			sum +=count;
			//System.out.println((double)sum/i+1);
			d1.setID(1);
			d2.setID(51);
		}
		long end=System.currentTimeMillis();
		System.out.println((double)sum/10000);
		System.out.println(end-start);
		System.out.println("one:"+ones+" two:"+twos);
	}

}
