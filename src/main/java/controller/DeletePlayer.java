package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.BcciDao;
import Dto.TeamDto;

@WebServlet("/delete")
public class DeletePlayer extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String js = req.getParameter("jersy");
		int in = Integer.parseInt(js);
		BcciDao bd = new BcciDao();
		bd.delete(in);
		resp.getWriter().print("data deleted");
		
		List<TeamDto> l = bd.fetchall();
		req.setAttribute("objects", l);
		RequestDispatcher rd = req.getRequestDispatcher("admin_fetchall.jsp");
		rd.forward(req, resp);
		
	}
}
