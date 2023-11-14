public class Main {
    public static void main(String[] args) {

        Author nabokov = new Author("Владимир", "Набоков");
        Book book = new Book("Лолита", nabokov, 1955);
        Author pullman = new Author("Филип", "Пулман");
        Book oid = new Book("Темные начала", nabokov, 1997);

        book.setPublicationYear(1956);
    }
}
