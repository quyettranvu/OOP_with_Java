class Main {
    public static void main(String[] args) {
        User user = new User("Quyet Tran Vu", "2000-11-13");

        // user.name = "Quyet Tran Vu";
        // user.birthDay = LocalDate.parse("2000-11-13");

        // Book book = new Book("Learning OOP with Java", "Quyet Tran", 300);
        AbstractBook book = new Book("Learning OOP with Java", "Quyet Tran", 300, 20);
        AudioBook audioBook = new AudioBook("Learning Backend with Java", "Quyet", 150, 15, 10);
        Ebook myEbook = new Ebook("Learning Android development with Java", "Tran Quyet", 200, 30, "PDF");
        // book.title = "Learning OOP with Java";
        // book.author = "Quyet Tran";

        System.out.println(book.toString());
        book.showInfo(300, 13);
        System.out.println(audioBook.toString());
        audioBook.printBook();
        System.out.println(myEbook.toString());
        myEbook.downloadBook();

        audioBook.discountSale(5);
        System.out.println("Price of the audiobook after discount: " + audioBook.getPrice());

        myEbook.updateNew(5);
        System.out.println("Price of the audiobook after new updating: " + myEbook.getPrice());

        System.out.println("Info about number of published times of books: ");
        audioBook.generalInfo(3);
        myEbook.generalInfo();

        // user.borrow(book);
        user.borrow(audioBook);
        user.borrow(myEbook);
        // System.out.printf("%s has birthday on %s and now %d years old. \n",
        // user.getName(), user.getBirthDay(), user.age());

        System.out.printf("%s has borrowed these books %s. \n",
                user.getName(), user.borrowedBooks());

        // System.out.println();

        // User olderUser = new User();

        // olderUser.name = "Tran Thi Thu Hoa";
        // olderUser.birthDay = LocalDate.parse("1995-11-23");

        // System.out.printf("%s has birthday on %s and am now %d years old.",
        // olderUser.name, olderUser.birthDay.toString(), olderUser.age());
    }
}