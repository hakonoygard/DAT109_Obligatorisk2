package no.hvl.dat109.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat109.entity.Bil;
import no.hvl.dat109.utils.dbDAO;



/**
 * Servlet implementation class ResultatBilerServlet
 */
@WebServlet("/resultatBiler")
public class ResultatBilerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@EJB
	private dbDAO dbDao;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Bil> biler = dbDao.hentAlleBiler();
		request.setAttribute("biler", biler);
		request.getRequestDispatcher("WEB-INF/billiste.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
