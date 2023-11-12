public class Book {
    public final String name;
    public final Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public int publicationYear() {
        return publicationYear;
    }
    public void publicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}


