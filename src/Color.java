/**
 * Created by petro on 27-Mar-17.
 */
public enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, BROWN, BLACK, WHITE;

    public String toString() {
        switch (this) {
            case RED:
                return "Red";
            case GREEN:
                return "Green";
            case BLUE:
                return "Blue";
            case YELLOW:
                return "Yellow";
            case ORANGE:
                return "Orange";
            case PURPLE:
                return "Purple";
            case PINK:
                return "Pink";
            case BROWN:
                return "Brown";
            case BLACK:
                return "Black";
            case WHITE:
                return "White";
            default:
                return "Unspecified";
        }
    }
}