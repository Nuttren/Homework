public class Book {
    private String bookName;
    private int bookAge;
    Author Author;


    public Book (String bookName, Author Author, int bookAge) {
        this.bookName = bookName;
        this.Author = Author;
        this.bookAge = bookAge;
    }

    public String getBookName () {
        return this.bookName;
    }

    public int getBookAge () {
        return this.bookAge;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }
}
