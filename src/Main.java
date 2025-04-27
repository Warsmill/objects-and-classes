public class Main {
    public static void main(String[] args) {
        Author authorBookOne = new Author("Алекс","Эсперанса");
        Book bookOne = new Book("Белый хакер", authorBookOne, 2000);

        Author authorBookTwo = new Author("Джон"," Хортон");
        Book bookTwo = new Book("Разработчик Android - приложений", authorBookTwo,2021 );
        bookOne.setBookPublicationDate(2024);

        bookOne.bookInfo();
        bookTwo.bookInfo();
    }
}