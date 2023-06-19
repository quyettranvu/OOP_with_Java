public class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String author, int pageCount, int price, int runTime) {
        super(title, author, 0, price);

        this.runTime = runTime;
    }

    // overriding same method in parent book but in different way(polymorphism)
    public void generalInfo() {
        System.out.println("This is an audio book");
    }

    // Also overrloading method (polymorphism)
    public void generalInfo(int publishedTime) {
        for (int i = 0; i < publishedTime; i++) {
            System.out.println("This is an audio book");
        }
    }

    public int getRunTime() {
        return this.runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
}
