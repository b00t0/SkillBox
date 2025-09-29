public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K.Rowling", 658, 1278461);

        System.out.println("Book: " + book.getName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Amount of pages: " + book.getPages());
        System.out.println("ISBN: " + book.getISBN());

    }
}
