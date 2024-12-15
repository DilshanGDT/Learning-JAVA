import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get form data
        String surname = request.getParameter("surname");
        String initials = request.getParameter("initials");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");

        // Validate required fields
        if (surname == null || initials == null || gender == null) {
            out.println("Error: All fields are required.");
            return;
        }

        // Create a session and store user data
        HttpSession session = request.getSession();
        session.setAttribute("surname", surname);
        session.setAttribute("initials", initials);
        session.setAttribute("gender", gender);
        session.setAttribute("hobbies", hobbies != null ? Arrays.asList(hobbies) : new ArrayList<>());

        // Generate dynamic report
        out.println("Successfully registered!");
        out.println("Hi " + surname + ", welcome to CSC3103");
        out.println("Your details:");
        out.println("Name: " + initials + " " + surname);

        if (hobbies != null && hobbies.length > 0) {
            out.println("Hobbies: " + String.join(", ", hobbies));
        } else {
            out.println("Hobbies: None");
        }
    }
}
