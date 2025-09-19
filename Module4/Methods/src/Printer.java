public class Printer {
    String queue = "";

    int pagesInQueue = 0;
    int totalPrintedPages = 0;

    public void append(String text) {
        append(text, "Documents with no name", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, int pagesCount) {
        append(text,"Documents with no name", pagesCount);
    }

    public void append(String text, String name, int pagesCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }

    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        System.out.println(queue);
        totalPrintedPages = totalPrintedPages + getPendingPagesCount();
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getTotalPrintedPages() {
        return totalPrintedPages;
    }

}
