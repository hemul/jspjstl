package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends HttpServlet {

    @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        //        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JSPJSTLPersistenceUnit");
        //        EntityManager manager = emFactory.createEntityManager();
        ////        manager.getTransaction( ).begin( );
        ////
        ////        User user = new User();
        ////        user.setName("Anton");
        ////        user.setPassword("12345");
        ////
        ////        manager.persist(user);
        ////        manager.getTransaction( ).commit( );
        //
        //        User user = manager.find(User.class, 1);
        //
        //        manager.close();
        //        emFactory.close();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>");
        out.println("Hi there!");
        out.println("</h1>");
        out.println("<p>");
        out.println("Hello world!");
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
