package Live;

import music.Playable;
import music.String.Veena;
import music.wind.Sexophone;

public class Test {

	public static void main(String[] args) {
		Veena v= new Veena();
		v.play();
		Playable pv = new Veena();
		pv.play();
		Sexophone s = new Sexophone();
		s.play();
		Playable ps = new Sexophone();
		ps.play();
	}

}
