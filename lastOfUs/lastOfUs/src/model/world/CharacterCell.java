package model.world;
import model.characters.*;
import model.characters.Character;
public class CharacterCell extends Cell {
	public CharacterCell(){
		super();
	} 
	private Character character;
	private boolean isSafe;
public void setCharacter(Character character){
		this.character=character;
	} 
public Character getCharacter(){
	return character;
	
}
	public boolean isSafe() {
		return isSafe;
	}
}
