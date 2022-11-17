public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private String publishDate;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
