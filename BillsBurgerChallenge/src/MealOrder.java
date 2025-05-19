public class MealOrder {

    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder (Item side, Item drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public MealOrder (Burger burger) {
        this(null, null, burger);
    }

    public void printItemizedList() {
        burger.printItem();
        System.out.println();
        if (drink != null) {
            drink.printItem();
        }
        System.out.println();
        if (side != null) {
            side.printItem();
        }
    }

    public void printTotal() {
        double burgerPrice = burger.getAdjustedPrice();
        double toppingPrice = burger.getToppingPrice();
        double drinkPrice = (drink == null) ? 0D : drink.getAdjustedPrice();
        double sidePrice = (side == null) ? 0D : side.getAdjustedPrice();

        System.out.printf("Total is %.2f%n", burgerPrice + toppingPrice + drinkPrice + sidePrice);
    }
}
