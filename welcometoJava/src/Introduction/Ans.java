package Introduction;

public class Ans{
	public static void main(String[] args) {
	Instrument inst[] = new Instrument[10];
	inst[0] = new Piano();
	inst[1] = new Flute();
	inst[2] = new Guitar();
	inst[3] = new Piano();
	inst[4] = new Flute();
	inst[5] = new Guitar();
	inst[6] = new Piano();
	inst[7] = new Flute();
	inst[8] = new Guitar();
	inst[9] = new Piano();
	for(int i =0 ;i<inst.length;i++) {
		if (inst[i] instanceof Piano) {
			System.out.println("Yes its Piano");
			inst[i].play();
		}
		if (inst[i] instanceof Flute) {
			System.out.println("Yes its Flute");
			inst[i].play();
		}
		if (inst[i] instanceof Guitar) {
			System.out.println("Yes its Guitar");
			inst[i].play();
		}
	}
}
}
