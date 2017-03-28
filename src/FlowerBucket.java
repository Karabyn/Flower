import java.util.ArrayList;

/**
 * Created by petro on 28-Mar-17.
 */
public class FlowerBucket {

    private ArrayList<Flower> flowersInBucket;

    public FlowerBucket() {
        flowersInBucket = new ArrayList<>();
    }

    public void addFlowerToBucket(Flower flower) {
        flowersInBucket.add(flower);
    }

    public double getBucketPrice() {
        double price = 0;
        for(Flower flower : flowersInBucket) {
            price += flower.getPrice();
        }
        return price;
    }

    public void printBucketInfo() {
        System.out.println("Bucket contains: " + getNumberOfFlowersInBucket() + " flowers" + "\n" +
                "Price of a bucket: " + getBucketPrice() + " $" + "\n" + "Flowers in a bucket: ");
        for(Flower flower : flowersInBucket) {
            System.out.println(flower.toString());
        }
    }

    public int getNumberOfFlowersInBucket() {
        return flowersInBucket.size();
    }

}


