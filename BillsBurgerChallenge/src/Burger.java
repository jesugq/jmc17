public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, Double price, String size, Item extra1, Item extra2, Item extra3) {
        super(name, "Burger", price, size);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public Burger(String name, Double price, String size) {
        this(name, price, size, null, null, null);
    }

    public Burger(String name, Double price) {
        this(name, price, "Medium", null, null, null);
    }

    @Override
    public double getAdjustedPrice() {
        return switch (getSize()) {
            case "Small" -> getBasePrice() / 2D;
            case "Large" -> getBasePrice() * 2D;
            default -> getBasePrice();
        };
    }

    public double getToppingPrice() {
        double extra1Price = (extra1 == null) ? 0D : extra1.getAdjustedPrice();
        double extra2Price = (extra2 == null) ? 0D : extra2.getAdjustedPrice();
        double extra3Price = (extra3 == null) ? 0D : extra3.getAdjustedPrice();

        return extra1Price + extra2Price + extra3Price;
    }

    @Override
    public void printItem() {
        System.out.printf("%8s : %s, %s, %.2f, %s%n", "Burger", getName(), getType(), getAdjustedPrice(), getSize());

        if (extra1 != null) {
            extra1.printItem();
        }

        if (extra2 != null) {
            extra2.printItem();
        }

        if (extra3 != null) {
            extra3.printItem();
        }
    }

    public void addToppings(Item extra1, Item extra2, Item extra3) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }
}
