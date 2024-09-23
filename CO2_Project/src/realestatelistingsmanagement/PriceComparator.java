package realestatelistingsmanagement;

import java.util.Comparator;

public class PriceComparator implements Comparator<RealEstateListing> {
    @Override
    public int compare(RealEstateListing o1, RealEstateListing o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}


