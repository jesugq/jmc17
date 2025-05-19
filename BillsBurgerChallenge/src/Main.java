public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Big Mac", 5D);
        Item extra1 = new Item("Cheese", "Extra", 1D, "Single");
        Item extra2 = new Item("Rings", "Extra", 2D, "Double");
        Item extra3 = new Item("Avante", "Extra", 1D, "Single");
        burger.printItem();
        burger.setSize("Large");
        burger.printItem();
        burger.addToppings(extra1, extra2, extra3);
        burger.printItem();

        System.out.println();

        Item drink = new Item("Fanta", "Drink", 2D);
        drink.printItem();
        drink.setSize("Small");
        drink.printItem();

        System.out.println();

        Item side = new Item("Fries", "Side", 2D);
        side.printItem();
        side.setSize("Small");
        side.printItem();

        System.out.println();

        MealOrder mealOrder = new MealOrder(side, drink, burger);
        mealOrder.printItemizedList();
        mealOrder.printTotal();

        System.out.println();

        ItemJMC coke = new ItemJMC("drink", "coke", 1.5);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        System.out.println();

        BurgerJMC borger = new BurgerJMC("regular", 4.0);
        borger.addToppings("BACON", "CHEESE", "MAYO");
        borger.printItem();

        System.out.println();

        MealOrderJMC regularMeal = new MealOrderJMC();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        System.out.println();

        MealOrderJMC secondMeal = new MealOrderJMC("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        System.out.println();

        MealOrderJMC deluxeMeal = new MealOrderJMC("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
