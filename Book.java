public class Book extends AbstractBook implements Strategy {
    private String title;
    private String author;
    private int pageCount;
    private int price;

    // constructor
    Book(String title, String author, int pageCount, int price) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }

    // methods getter, setter
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // own method
    public void generalInfo() {
        System.out.println("This is book prototype");
    }

    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }

    // define abstract methods inherited
    void printBook() {
        System.out.println("Print a book");
    }

    // define implemented methods by overriding them
    @Override
    public void updateNew(int increment) {
        price = price + increment;
    }

    @Override
    public void discountSale(int decrement) {
        price = price - decrement;
    }

    void downloadBook() {
        System.out.println("Download a book");
    }
}
