import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test

    public void test() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(101, "Harry Potter", 300, "John");
        Book book2 = new Book(234, "Spring", 200, "John");
        Book book3 = new Book(380, "Summer", 350, "John");
        Book book4 = new Book(445, "Winter", 270, "John");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);

        Product[] actual = manager.searchBy("Harry");
        Product[] expected = {book1, book2};

        Assertions.assertArrayEquals(expected, actual);
    }

}
