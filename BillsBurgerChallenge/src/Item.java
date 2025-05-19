public class Item {

    private String name;
    private String type;
    private Double price;
    private String size;

    public Item(String name, String type, Double price, String size) {
        this.name = name;
        this.type = type;
        this.price = (price<0D) ? 0D : price;
        this.setSize(size);
    }

    public Item(String name, String type, Double price) {
        this(name, type, price, "Medium");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "Small" -> getBasePrice() / 1.5D;
            case "Large", "Double" -> getBasePrice() * 1.5D;
            default -> getBasePrice();
        };
    }

    public void printItem() {
        String realType = switch (type) {
            case "Drink", "Side", "Extra" -> type;
            default -> "Item";
        };
        System.out.printf("%8s : %s, %s, %.2f, %s%n", realType, getName(), getType(), getAdjustedPrice(), getSize());
    }

    public void setSize(String size) {
        switch (size) {
            case "Small", "Medium", "Large" -> this.size = size;
            default -> this.size = "Medium";
        }
    }
}
