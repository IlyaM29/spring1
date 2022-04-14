public class Product {

    private final int id;
    private final String title;
    private final int cost;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String info () {
        return id + " " + title + " " + cost;
    }
}
