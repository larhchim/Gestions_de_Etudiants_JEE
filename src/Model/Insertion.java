package Model;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Insertion")
public class Insertion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cin=request.getParameter("cin");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		
		HttpSession session =request.getSession();
		ArrayList<GestionEtudiants> a=(ArrayList<GestionEtudiants>) session.getAttribute("eleves");
		
		a.add(new GestionEtudiants(nom,prenom,cin));
		
		request.setAttribute("eleves", a);
		session.setAttribute("eleves", a);
		request.getRequestDispatcher("/Etudiant.jsp").forward(request, response);
	}

}
