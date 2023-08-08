package model.world;
import java.util.Random;

public class TrapCell extends Cell {
	Random rand = new Random();
	private int trapDamage=((rand.nextInt(3))+1)*10;
public TrapCell(){
	super();
}
public int getTrapDamage() {
	return trapDamage;
	}
}
	


