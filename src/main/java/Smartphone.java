public class Smartphone extends Product{
    protected int manufacturer;

    public Smartphone(int id, int name, int price, int manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }
}
