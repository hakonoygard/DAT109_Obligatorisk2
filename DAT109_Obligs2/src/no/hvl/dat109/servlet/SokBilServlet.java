package no.hvl.dat109.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat109.entity.Utleiekontor;
import no.hvl.dat109.utils.dbDAO;

/**
 * Servlet implementation class SokBilServlet
 */
@WebServlet("/SokeSide")
public class SokBilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private dbDAO dbDao;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Utleiekontor> utleiekontor = dbDao.hentAlleUtleiekontor(); 
		request.setAttribute("utleiekontor", utleiekontor);
		request.getRequestDispatcher("WEB-INF/SokeSide.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int henteId = Integer.parseInt((String) request.getParameter("hentested"));
		int returId = Integer.parseInt((String) request.getParameter("retursted"));
		
		Utleiekontor hentested = dbDao.finnUtleiekontorMedId(henteId);
		Utleiekontor retursted = dbDao.finnUtleiekontorMedId(returId);
		//LocalDate datoHenting = (LocalDate) request.getParameter("hentedato");
		int antallDager = Integer.parseInt((String) request.getParameter("antallDager"));
		//LocalTime klokkeslett = (LocalTime) request.getParameter("hentetidspunkt");
		//System.out.print(datoHenting);
		//System.out.print(klokkeslett);
		System.out.println(antallDager);
		response.sendRedirect("resultatBiler");
	}

}
