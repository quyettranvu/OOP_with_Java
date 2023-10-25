public class Ebook extends Book {
    private String format;

    Ebook(String title, String author, int pageCount, int price, String format) {
        super(title, author, pageCount, price);

        this.format = format;
    }

    // inherit method -> and use for overload(polymorphism)
    public void generalInfo() {
        System.out.println("This is an ebook");
    }

    public void generalInfo(int publishedTime) {
        for (int i = 0; i < publishedTime; i++) {
            System.out.println("This is an ebook");
        }
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
