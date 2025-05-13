public class Main {

    public static void main(String[] args) {

        Printer single = new Printer(false, 50);
        System.out.println(single.addToner(50));
        System.out.println(single.addToner(50));
        System.out.println(single.printPages(100));
        System.out.println(single.printPages(100));
        System.out.println(single.getPagesPrinted());

        System.out.println();

        Printer duplex = new Printer(true, 50);
        System.out.println(duplex.addToner(50));
        System.out.println(duplex.addToner(50));
        System.out.println(duplex.printPages(200));
        System.out.println(duplex.printPages(200));
        System.out.println(duplex.getPagesPrinted());
    }
}
