package Model;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Identification")
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Identification() {
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String login =request.getParameter("lg");
		String password=request.getParameter("pd");
		HttpSession session1 =request.getSession();
		session1.setAttribute("ld",login);

		
		if(login.equals("admin") && password.equals("admin")) {

			GestionEtudiants student =new GestionEtudiants();
			ArrayList<GestionEtudiants> maList=student.Function();
			HttpSession session =request.getSession();
			session.setAttribute("eleves", maList);
			request.setAttribute("eleves", maList);
			
			

			request.getRequestDispatcher("/Etudiant.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("error", null);
			request.getRequestDispatcher("/failure.html").forward(request, response);
			//request.getRequestDispatcher("/Etudiant.jsp").forward(request, response);
			//request.getRequestDispatcher("/test.jsp").forward(request, response);


		}
		
		
	}

}
