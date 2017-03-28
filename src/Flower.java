import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by petro on 24-Mar-17.
 */
public class Flower {

    private final Type type;
    private final double price;
    private final Color color;
    private final double stemLength;
    private final NumberOfPetals numberOfPetals;

    private Flower(FlowerBuilder builder) {
        this.type = builder.type;
        this.price = builder.price;
        this.color = builder.color;
        this.stemLength = builder.stemLength;
        this.numberOfPetals = builder.numberOfPetals;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public double getStemLength() {
        return stemLength;
    }

    public NumberOfPetals getNumberOfPetals() {
        return numberOfPetals;
    }

    @Override
    public String toString() {
        return "Type: " + type + "; Color: " + color + "; Stem length: " + stemLength +
                "; Number of petals: "  + numberOfPetals + "; Price: " + price + "$";
    }

    public boolean matches(Flower flowerSpecs) {
        if(type != flowerSpecs.type) return false;
        if (color != flowerSpecs.color && flowerSpecs.color != null) return false;
        if (stemLength != flowerSpecs.stemLength && flowerSpecs.stemLength != 0.0) return false;
        if (numberOfPetals != flowerSpecs.numberOfPetals && flowerSpecs.numberOfPetals != null) return false;
        else return true;
    }


    public static class FlowerBuilder{
        private Type type; // required field
        private double price; // optional
        private Color color; // optional
        private double stemLength; // optional
        private NumberOfPetals numberOfPetals; // optional

        public FlowerBuilder(Type type) {
            this.type = type;
        }

        public FlowerBuilder price(double price){
            this.price = price;
            return this;
        }

        public FlowerBuilder color(Color color){
            this.color = color;
            return this;
        }

        public FlowerBuilder stemLength(double stemLength) {
            this.stemLength = stemLength;
            return this;
        }

        public FlowerBuilder numberOfPetals(NumberOfPetals numberOfPetals) {
            this.numberOfPetals = numberOfPetals;
            return this;
        }

        public Flower build() {
            return new Flower(this);
        }

    }
}

