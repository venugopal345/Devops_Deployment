package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TeamDao;
import Dto.TeamDto;

@WebServlet("/viewplayer")
public class ViewPlayer extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		TeamDao tda = new TeamDao();
		List<TeamDto> l = tda.fetchall();
		
		req.setAttribute("objects", l);
		RequestDispatcher rqd = req.getRequestDispatcher("viewPlayer.jsp");
		rqd.forward(req, resp);
	}
}
