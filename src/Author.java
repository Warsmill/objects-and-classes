public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getAuthorSurname(){
        return authorSurname;
    }
    public String toString(){
        return authorName.trim() + " " + authorSurname.trim();
    }
    public boolean equals(Object author){
        if(this == author)
            return true;
        Author authors = (Author) author;
        return authorName.equals(authors.authorName) && authorSurname.equals(authors.authorSurname);
    }
    public int hashCode(){
        int result = authorName.hashCode();
        result = result + authorSurname.hashCode();
        return result;
    }
}