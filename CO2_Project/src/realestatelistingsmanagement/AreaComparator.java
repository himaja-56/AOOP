package realestatelistingsmanagement;

import java.util.Comparator;

public class AreaComparator implements Comparator<RealEstateListing> {
    @Override
    public int compare(RealEstateListing o1, RealEstateListing o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
}