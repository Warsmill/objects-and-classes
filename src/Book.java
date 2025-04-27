public class Book {
    private String nameBook;
    private Author authorInfo;
    private int bookPublicationDate;

    public Book(String nameBook, Author authorInfo,int bookPublicationDate){
        this.nameBook = nameBook;
        this.authorInfo = authorInfo;
        this.bookPublicationDate = bookPublicationDate;
    }

    public String getNameBook(){
        return nameBook;
    }
    public Author getAuthorInfo(){
        return authorInfo;
    }
    public int getBookPublicationDate(){
        return bookPublicationDate;
    }
    public void setBookPublicationDate(int bookPublicationDate){
        this.bookPublicationDate = bookPublicationDate;
    }

    public void bookInfo(){
        String bookInfo = "'" + getNameBook().trim()+ "'" + " " + getAuthorInfo() +  ":" + " "
                + getBookPublicationDate() + ".";
        System.out.println(bookInfo);
    }
}