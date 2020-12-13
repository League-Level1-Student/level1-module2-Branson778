package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy");
	Smurf PapaSmurf = new Smurf("Papa");
	Smurf Smurfette = new Smurf("Smurfette");
	HandySmurf.eat();
	PapaSmurf.eat();
	Smurfette.eat();
	String name1 = HandySmurf.getName();
	System.out.println(name1);
	String name2 = PapaSmurf.getName();
	System.out.println(name2);
	String name3 = Smurfette.getName();
	System.out.println(name3);
	String hc1 = HandySmurf.getHatColor();
	System.out.println(hc1);
	String hc2 = PapaSmurf.getHatColor();
	System.out.println(hc2);
	String hc3 = Smurfette.getHatColor();
	System.out.println(hc3);
	String bg1 = HandySmurf.isGirlOrBoy();
	System.out.println(bg1);
	String bg2 = PapaSmurf.isGirlOrBoy();
	System.out.println(bg2);
	String bg3 = Smurfette.isGirlOrBoy();
	System.out.println(bg3);
}
}
