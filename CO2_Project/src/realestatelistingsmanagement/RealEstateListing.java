package realestatelistingsmanagement;

public class RealEstateListing implements Comparable<RealEstateListing>, Cloneable {
    private String id;
    private String address;
    private double price;
    private double area;

    public RealEstateListing(String id, String address, double price, double area) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.area = area;
    }

    // Getters and setters

    @Override
    public int compareTo(RealEstateListing other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public RealEstateListing clone() throws CloneNotSupportedException {
        return (RealEstateListing) super.clone();
    }

    @Override
    public String toString() {
        return "RealEstateListing{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", area=" + area +
                '}';
    }

	public double getArea() {
		// TODO Auto-generated method stub
		return area;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}
