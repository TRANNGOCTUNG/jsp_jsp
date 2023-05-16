package producServlet;

import test.Product;
import test.ProductCatalog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    private ProductCatalog productCatalog;
     public void init(){
         productCatalog = new ProductCatalog();

     }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productCatalog.getProducts();
        request.setAttribute("products", products);
        request.getRequestDispatcher("products.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
