import java.util.ArrayList;

/**
 * Created by petro on 27-Mar-17.
 */
public class Catalogue {

    private ArrayList<Flower> flowersCatalogue;

    public Catalogue() {
        flowersCatalogue = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowersCatalogue.add(flower);
    }

    public ArrayList<Flower> getFlowersCatalogue(){
        return flowersCatalogue;
    }

    public ArrayList<Flower> search(Flower flowerSpecs) {
        ArrayList<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : flowersCatalogue) {
            if (flower.matches(flowerSpecs)) {
                matchingFlowers.add(flower);
            }
        }
        return matchingFlowers;
    }
}
