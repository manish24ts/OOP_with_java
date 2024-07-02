import java.util.HashMap;
import java.util.Map;

class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class BookHashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookMap = new HashMap<>();
        bookMap.put(1, new Book(1, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 10));
        bookMap.put(2, new Book(2, "The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", 5));
        bookMap.put(3, new Book(3, "1984", "George Orwell", "Secker & Warburg", 15));
        System.out.println("Initial Book HashMap:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", " + entry.getValue());
        }
}
}

