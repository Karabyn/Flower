/**
 * Created by petro on 27-Mar-17.
 */
public enum Type {
    ROSE, CARNATION, TULIP, DAISY, SUNFLOWER, DAFFODIL, GERBERA, ORCHID, LILLY, OTHER;

    public String toString() {
        switch (this) {
            case ROSE: return "Rose";
            case CARNATION: return "Carnation";
            case TULIP: return "Tulip";
            case DAISY: return "Daisy";
            case SUNFLOWER: return "Sunflower";
            case DAFFODIL: return "Daffodil";
            case GERBERA: return "Gerbera";
            case ORCHID: return "Orchid";
            case LILLY: return "Lilly";
            case OTHER: return "Other";
            default: return "Unspecified";
        }
    }
}
