import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Product", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Product[] products = new Product[]{
                new Product(1, "product1", 5),
                new Product(2, "product2", 4),
                new Product(3, "product3", 6),
                new Product(4, "product4", 2),
                new Product(5, "product5", 7),
                new Product(6, "product6", 6),
                new Product(7, "product7", 10),
                new Product(8, "product8", 13),
                new Product(9, "product9", 2),
                new Product(10, "product10", 5)
        };
        for (Product product : products) {
            resp.getWriter().println(product.info());
        }
    }
}
