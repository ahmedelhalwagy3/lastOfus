package engine;
import model.characters.*;
import model.world.Cell;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Game {
	public static ArrayList<Hero> availableHeros;
	public static ArrayList<Hero> heros;
	public static ArrayList<Zombie> zombies;
	public static Cell[][] map;
	public static void loadHeros(String filePath)throws Exception{
	ArrayList<Hero> availableHeros = new ArrayList<>();
	BufferedReader br = new BufferedReader(new FileReader(filePath)); //source:Stack Overflow
	//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Downloads\\GUC_402_59_30348_2023-03-16T15_31_00 (1)"));
	String line;
		while ((line = br.readLine()) != null) {

		    String[] entries = line.split(",");
		    String name=entries[0];
		    int maxHp=Integer.parseInt(entries[2]);
		    int attackDmg=Integer.parseInt(entries[3]);
		    int maxActions=Integer.parseInt(entries[4]);
		    switch(entries[1].charAt(0)){
		    case('F'): Fighter fighter =new Fighter(name , maxHp,attackDmg,maxActions);availableHeros.add(fighter);break;
		    case('E'): Explorer explorer =new Explorer(name , maxHp,attackDmg,maxActions);availableHeros.add(explorer);break;
		    case('M'): Medic medic =new Medic(name , maxHp,attackDmg,maxActions);availableHeros.add(medic);break;
		    default:break;
		    
		    }
		   // Hero hero = new Hero(name,maxHp,attackDmg,maxActions); 
 //availableHeros.add(hero);
		}
		 br.close();

	}
	
}
