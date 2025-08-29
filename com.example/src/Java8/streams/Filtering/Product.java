package Java8.streams.Filtering;

public class Product {
    private final String name;
    private final String brand;
    private final double price;
    private final double rating;

    public Product(String name, String brand, double price, double rating) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
