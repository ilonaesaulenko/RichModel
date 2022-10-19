public class Book extends Product {
    protected int author;

    public Book(int id, int name, int price, int author) {
        super(id, name, price);
        this.author = author;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }
}