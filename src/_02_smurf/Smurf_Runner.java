package _02_smurf;

public class Smurf_Runner {

	public static void main (String[] args) {
		
		Smurf Handy = new Smurf("Handy");
		Handy.eat();
		Smurf PapaSmurf = new Smurf("Papa");
		PapaSmurf.getHatColor();
		PapaSmurf.isGirlOrBoy();
		Smurf Smurfette = new Smurf("Smurfette");
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
	}
}
