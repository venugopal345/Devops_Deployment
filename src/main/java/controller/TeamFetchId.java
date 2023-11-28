package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TeamDao;
import Dto.TeamDto;

@WebServlet("/fetchid")
public class TeamFetchId extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String jec = req.getParameter("jersy");
		int it = Integer.parseInt(jec);
		
		TeamDao td = new TeamDao();
		TeamDto id = td.fetchid(it);
		
		req.setAttribute("id", id);
		if(id!=null)
		{
			RequestDispatcher rd = req.getRequestDispatcher("fetchId.jsp");
			rd.forward(req, resp);
		}
		else
		{
			resp.getWriter().print("Enter Proper Jersy Number");
		}
		
	}
}
