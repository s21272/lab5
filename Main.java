import java.util.*;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Dar", 19,9, 5);
        Product product2 = new Product("Var", 10, 23,2 );
        Product product3 = new Product("Dim", 47, 1973, 3);

        User u1 = new User("Dasha", "Nilova", "s21272@pjwstk.edu.pl", "007");
        User u2 = new User("Elena","Tylkevich","tylkevna@mail.com","1975" );


        ArrayList<Product> allProducts = new ArrayList<>();
        Category c1 = new Category();
        Category c2 = new Category("second");
        Category c3 = new Category("third", allProducts );

        c1.addProduct(product1);
        c1.addProduct(product2);
        c1.addProduct(product3);
        c2.addProduct(product2);
        c3.addProduct(product3);


        Basket b1=new Basket();
        Basket b2= new Basket(u1);
        Basket b3= new Basket(u2, allProducts);

        b1.addProduct(product1);
        b3.deleteProduct(product3);
        b2.addProduct(product2);
        b2.buy();

    }
}
