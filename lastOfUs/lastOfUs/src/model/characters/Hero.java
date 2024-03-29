package model.characters;
import java.util.ArrayList;

import model.collectibles.Supply;
import model.collectibles.Vaccine;

public class Hero extends Character {
	private int actionsAvailable ;
	private int maxActions;
	private boolean specialAction;
	ArrayList<Vaccine> vaccineInventory;
	ArrayList<Supply> supplyInventory ;

	public Hero(String name, int maxHp, int attackDmg, int maxActions) {
		super(name, maxHp, attackDmg);
		this.maxActions=maxActions;
		
	}

	public int getActionsAvailable() {
		return actionsAvailable;
	}

	public void setActionsAvailable(int actionsAvailable) {
		this.actionsAvailable = actionsAvailable;
	}

	public int getMaxActions() {
		return maxActions;
	}

	
	public boolean isSpecialAction() {
		return specialAction;
	}

	public void setSpecialAction(boolean specialAction) {
		this.specialAction = specialAction;
	}

	public ArrayList<Vaccine> getVaccineInventory() {
		return vaccineInventory;
	}

	

	public ArrayList<Supply> getSupplyInventory() {
		return supplyInventory;
	}

	
	

}
