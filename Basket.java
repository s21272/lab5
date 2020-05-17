import java.util.ArrayList;

public class Basket {
    private User user;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Basket() {
    }

    public Basket(User user) {
        this.user = user;
    }

    public Basket(User user, ArrayList<Product> products) {
        this.user = user;
        this.products = products;
    }

    public void addProduct(Product product) {
        int maxSize = products.size();
        boolean Space = false;
        int numOfItems = product.getNumberOfItems();

        if (numOfItems >= 1) {
            products.add(product);
            product.setNumOfPieces(numOfItems - 1);
            System.out.println("product " + product.getName() +
                    " added " + product.getNumberOfItems() +
                    "  remaining ");
        } else {
            Space = true;
            System.out.println("no more products"); }

    }

    public void deleteProduct(Product product) {
        int maxSize = products.size();
        boolean space = false;
        int numOfItems = product.getNumberOfItems();

        if (maxSize >= 1) {
            products.remove(product);
            product.setNumOfPieces(numOfItems + 1);
            System.out.println("product " +
                    product.getName() + " removed. " +
                    product.getNumberOfItems() +
                    " remaining.");
        } else {
            space = true;
            System.out.println("empty");
        }
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void buy() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice();
        }
        System.out.println("Total  " + total);
    }
}