import java.util.ArrayList;

/**
 * Created by petro on 27-Mar-17.
 */
public class FlowerTester {

    private static Catalogue catalogue;

    public static void main(String[] args) {
        catalogue = new Catalogue();
        fillCatalogue();

        System.out.println("Entries in catalogue:");
        for(Flower flower : catalogue.getFlowersCatalogue()) {
            System.out.println(flower.toString());
        }
        System.out.println();

        Flower searchedFlower = new Flower.FlowerBuilder(Type.TULIP).build();
        ArrayList<Flower> matchingFLowers = catalogue.search(searchedFlower);
        System.out.println("Searching for flowers: ");
        for(Flower flower : matchingFLowers) {
            System.out.println("Matching flowers: " + flower.toString());
        }

        searchedFlower = new Flower.FlowerBuilder(Type.ORCHID).color(Color.WHITE).build();
        matchingFLowers = catalogue.search(searchedFlower);
        System.out.println("\nSearching for flowers: ");
        for(Flower flower : matchingFLowers) {
            System.out.println("Matching flowers: " + flower.toString());
        }

        System.out.println("\nCreating a bucket of flowers");
        FlowerBucket flowerBucket = new FlowerBucket();
        createBucket(flowerBucket);
        flowerBucket.printBucketInfo();
    }

    private static void fillCatalogue() {
        catalogue.addFlower(new Flower.FlowerBuilder(Type.TULIP).price(1).color(Color.PURPLE).stemLength(25).
                numberOfPetals(NumberOfPetals.THREE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.TULIP).price(1.25).color(Color.RED).stemLength(30).
                numberOfPetals(NumberOfPetals.THREE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.TULIP).price(1.5).color(Color.YELLOW).stemLength(35).
                numberOfPetals(NumberOfPetals.THREE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.ROSE).price(2.5).color(Color.RED).stemLength(40).
                numberOfPetals(NumberOfPetals.FIVE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.ROSE).price(4).color(Color.RED).stemLength(60).
                numberOfPetals(NumberOfPetals.FIVE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.DAISY).price(0.25).color(Color.WHITE).stemLength(25).
                numberOfPetals(NumberOfPetals.MANY).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.ORCHID).price(8).color(Color.WHITE).stemLength(40).
                numberOfPetals(NumberOfPetals.THREE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.ORCHID).price(10).color(Color.PURPLE).stemLength(60).
                numberOfPetals(NumberOfPetals.THREE).build());
        catalogue.addFlower(new Flower.FlowerBuilder(Type.GERBERA).price(2).color(Color.BLUE).stemLength(50).
                numberOfPetals(NumberOfPetals.MANY).build());
    }

    private static void createBucket(FlowerBucket flowerBucket) {
        ArrayList<Flower> flowersForBucket = catalogue.search(new Flower.FlowerBuilder(Type.TULIP).build());
        for(Flower flower : flowersForBucket) {
            for(int i = 0; i < 3; i++)
            flowerBucket.addFlowerToBucket(flower);
        }
    }
}