public class Printer {

    private int pagesPrinted;
    private boolean duplex;
    private int tonerLevel;

    public Printer(int pagesPrinted, boolean duplex, int tonerLevel) {
        this.pagesPrinted = Math.max(pagesPrinted, 0);
        this.duplex = duplex;
        this.tonerLevel = tonerLevel<0 ? 1 : Math.min(tonerLevel, 100);
    }

    public Printer(boolean duplex, int tonerLevel) {
        this(0, duplex, tonerLevel);
    }

    public Printer(boolean duplex) {
        this(0, duplex, 100);
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0) return -1;
        if (tonerLevel + tonerAmount > 100) return -1;

        tonerLevel += tonerAmount;
        return tonerAmount;
    }

    public int printPages(int pages) {
        if (pages <= 0) return -1;
        pages = duplex ? pages/2 + pages%2 : pages;
        if (tonerLevel - pages < 0) return -1;

        tonerLevel -= pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
