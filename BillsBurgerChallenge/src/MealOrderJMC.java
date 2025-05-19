public class MealOrderJMC {

    private BurgerJMC burger;
    private ItemJMC drink;
    private ItemJMC side;

    public MealOrderJMC() {
        this("regular", "coke", "fries");
    }

    public MealOrderJMC(String burgerType, String drinkType, String sideType) {

        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurgerJMC(burgerType, 8.5);
        } else {
            this.burger = new BurgerJMC(burgerType, 4.0);
        }

        this.drink = new ItemJMC("drink", drinkType, 1.00);
        this.side = new ItemJMC("side", sideType, 1.50);
    }

    public double getTotalPrice() {

        if (burger instanceof DeluxeBurgerJMC) {
            return burger.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {

        burger.printItem();
        if (burger instanceof DeluxeBurgerJMC) {
            ItemJMC.printItem(drink.getName(), 0);
            ItemJMC.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }

        System.out.println("-".repeat(30));
        ItemJMC.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {

        if (burger instanceof DeluxeBurgerJMC db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
