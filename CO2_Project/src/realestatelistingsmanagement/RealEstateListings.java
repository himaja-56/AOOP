package realestatelistingsmanagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class RealEstateListings implements Iterable<RealEstateListing> {
    private List<RealEstateListing> listings;

    public RealEstateListings() {
        this.listings = new ArrayList<>();
    }

    public void addListing(RealEstateListing listing) {
        listings.add(listing);
    }

    public void removeListing(RealEstateListing listing) {
        listings.remove(listing);
    }

    @Override
    public Iterator<RealEstateListing> iterator() {
        return listings.iterator();
    }

    public void sortListings(Comparator<RealEstateListing> comparator) {
        listings.sort(comparator);
    }
}
