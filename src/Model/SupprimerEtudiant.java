package Model;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SupprimerEtudiant")
public class SupprimerEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SupprimerEtudiant() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session =request.getSession();
		ArrayList<GestionEtudiants> a=(ArrayList<GestionEtudiants>) session.getAttribute("eleves");
		System.out.print(a);
		String cin =request.getParameter("ds");
		for (int i = 0; i < a.size(); i++) {
			
			if(a.get(i).getCin().equals(cin)) {
				
				a.remove(i);
				
				
			}
			    
		}
	

		request.setAttribute("eleves", a);
		session.setAttribute("eleves", a);
		request.getRequestDispatcher("/Etudiant.jsp").forward(request, response);

		
	}

}
