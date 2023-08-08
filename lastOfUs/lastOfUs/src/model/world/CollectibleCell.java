package model.world;
import model.collectibles.Collectibles;
public class CollectibleCell extends Cell {
public CollectibleCell() {
	super();
}
    private Collectibles collectible;
    public Collectibles getCollectible() {
    	return collectible;
    }
}
