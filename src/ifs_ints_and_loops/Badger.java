package ifs_ints_and_loops;

public class Badger {
	public static void main(String[] args) {
		int SNEK = 0;
		int Shroom = 0;
	
for(int x = 0; x < 15; x++ ) {
	System.out.println("Badger");
	Shroom++;
	SNEK++;
	if(SNEK == 15) {
		System.out.println("SNAKE");
	}
	else if(Shroom == 5 || Shroom == 10) {
		System.out.println("MUSHROOM");
	}
}
}
}