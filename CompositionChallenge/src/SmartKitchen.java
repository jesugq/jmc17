public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Dishwasher dishwasher;
    private Refrigerator icebox;

    public SmartKitchen(CoffeeMaker brewMaster, Dishwasher dishwasher, Refrigerator icebox) {
        this.brewMaster = brewMaster;
        this.dishwasher = dishwasher;
        this.icebox = icebox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishwasher.setHasWorkToDo(true);
    }

    public void pourMilk() {
        icebox.setHasWorkToDo(true);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        icebox.orderFood();
        dishwasher.doDishes();
    }

    public void setKitchenState(boolean brewMasterState, boolean dishwasherState, boolean iceboxState) {
        brewMaster.setHasWorkToDo(brewMasterState);
        dishwasher.setHasWorkToDo(dishwasherState);
        icebox.setHasWorkToDo(iceboxState);
    }
}

class CoffeeMaker {

    protected boolean hasWorkToDo;

    public CoffeeMaker() {
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("CoffeeMaker is working.");
        }
    }
}

class Dishwasher {

    protected boolean hasWorkToDo;

    public Dishwasher() {
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishwasher is working.");
        }
    }
}

class Refrigerator {

    protected boolean hasWorkToDo;

    public Refrigerator() {
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Refrigerator is working.");
        }
    }
}
