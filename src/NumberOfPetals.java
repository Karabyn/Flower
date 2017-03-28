/**
 * Created by petro on 27-Mar-17.
 */
public enum NumberOfPetals {
    NO, MANY, ONE, TWO, THREE, FOUR, FIVE, SIX;

    public String toString() {
        switch (this) {
            case NO: return "No";
            case MANY: return "Many";
            case ONE: return "One";
            case TWO: return "Two";
            case THREE: return "Three";
            case FOUR: return "Four";
            case FIVE: return "Five";
            case SIX: return "Six";
            default: return "Unspecified";
        }
    }
}
