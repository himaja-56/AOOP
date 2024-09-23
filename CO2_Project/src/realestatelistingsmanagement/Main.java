package realestatelistingsmanagement;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealEstateListings listings = new RealEstateListings();

        RealEstateListing listing1 = new RealEstateListing("1", "Hyderabad", 300000, 1500);
        RealEstateListing listing2 = new RealEstateListing("2", "Mumbai", 250000, 1200);
        RealEstateListing listing3 = new RealEstateListing("3", "Banglore", 350000, 1800);

        listings.addListing(listing1);
        listings.addListing(listing2);
        listings.addListing(listing3);

        System.out.println("Original Listings:");
        for (RealEstateListing listing : listings) {
            System.out.println(listing);
        }

        listings.sortListings(new PriceComparator());
        System.out.println("\nListings Sorted by Price:");
        for (RealEstateListing listing : listings) {
            System.out.println(listing);
        }

        listings.sortListings(new AreaComparator());
        System.out.println("\nListings Sorted by Area:");
        for (RealEstateListing listing : listings) {
            System.out.println(listing);
        }

        RealEstateListing clonedListing = listing1.clone();
        System.out.println("\nCloned Listing:");
        System.out.println(clonedListing);
    }
}

