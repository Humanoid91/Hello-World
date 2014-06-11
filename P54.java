import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Card{
	private char ID;
	private char suit;
	/*public Card(char iD, char suit) {
		ID = iD;
		this.suit = suit;
	}*/
	public char getID() {
		return ID;
	}
	public void setID(char iD) {
		ID = iD;
	}
	public char getSuit() {
		return suit;
	}
	@Override
	public String toString() {
		return "Card [ID=" + ID + ", suit=" + suit + "]";
	}
	public void setSuit(char suit) {
		this.suit = suit;
	}
}
class Person{
	private Card[] card=new Card[5];

	/*public Person(Card[] card) {
		this.card = card;
	}*/

	public Card[] getCard() {
		return card;
	}

	@Override
	public String toString() {
		return "Person [card=" + Arrays.toString(card) + "]";
	}

	public void setCard(Card[] card) {
		this.card = card;
	}
}
class poker{
	
}
public class P54 {
	
	public static void main(String[] args) {
		File file = new File("poker.txt");
		Scanner in;
		Card[] C1 = new Card[5];
		Card[] C2 = new Card[5];
		Person P1 = new Person();
		Person P2 = new Person();
		try {
			in=new Scanner(file);
			for(int i=0;i<1;i++){
				String b=in.nextLine();
				//System.out.println(b);
				int k=0;
				for(int j=0;j<5;j++,k+=3){
					if(i==0){
						C1[j]=new Card();
					}
					C1[j].setID(b.charAt(k));
					C1[j].setSuit(b.charAt(k+1));
				}
				for(int j=0;j<5;j++,k+=3){
					if(i==0){
						C2[j]=new Card();
					}
					C2[j].setID(b.charAt(k));
					C2[j].setSuit(b.charAt(k+1));
				}
				//System.out.println(C1[0].toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
