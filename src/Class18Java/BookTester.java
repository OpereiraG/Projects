package Class18Java;

public class BookTester {

    public static void main(String[] args) {


        Book book1 = new Book("Large book","Tiny book");
        Book book2 = new Book("Read fast it's small");

        System.out.println(book1.bigBook);
        System.out.println(book1.smallBook);
        System.out.println(book2.smallBook);

    }
}
