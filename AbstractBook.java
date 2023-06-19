
public abstract class AbstractBook {
    int num_pages, loved_page;

    // Base constructor for abtract class
    // AbstractBook() {
    // System.out.println("Base abstract class");
    // }

    void showInfo(int showNumPages, int showLovedPage) {
        System.out.println("The book has " + showNumPages + " and its beloved page: " + showLovedPage);
    }

    abstract void downloadBook();

    abstract void printBook();
}
