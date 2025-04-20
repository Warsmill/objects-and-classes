public class Main {
    public static void main(String[] args) {
        Author authorBookOne = new Author("Алекс","Эсперанса");
        Book bookOne = new Book("Белый хакер", authorBookOne, 2000);

        Author authorBookTwo = new Author("Джон"," Хортон");
        Book bookTwo = new Book("Разработчик Android - приложений", authorBookTwo,2021 );
        bookOne.setBookPublicationDate(2024);

        Author authorBookThee = new Author("Алекс","Эсперанса");
        Book bookThree = new Book("Белый хакер", authorBookOne, 2024);

        System.out.println(bookOne.equals(bookThree));
        System.out.println( bookOne.equals(bookTwo));
        System.out.println(bookTwo.equals(bookThree));

        bookOne.bookInfo();
        bookTwo.bookInfo();
        bookThree.bookInfo();
    }
}