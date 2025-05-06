public class Main {

    public static void main(String[] args) {

        CoffeeMaker brewMaster = new CoffeeMaker();
        Dishwasher dishwasher = new Dishwasher();
        Refrigerator icebox = new Refrigerator();

        SmartKitchen smartKitchen = new SmartKitchen(brewMaster, dishwasher, icebox);

        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        smartKitchen.getDishwasher().setHasWorkToDo(true);
        smartKitchen.getIcebox().setHasWorkToDo(true);

        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishwasher().doDishes();
        smartKitchen.getIcebox().orderFood();

        System.out.println();

        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();
    }
}
