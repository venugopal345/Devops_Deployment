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
import Dao.TeamDao;
import Dto.TeamDto;

@WebServlet("/update")
public class UpdateTeam extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String jrcy = req.getParameter("jersy");
		String nm=req.getParameter("name");
		String ag=req.getParameter("age");
		String mtch=req.getParameter("matches");
		String rl=req.getParameter("role");
		String bs=req.getParameter("bestscore");
		
		int jersyno = Integer.parseInt(jrcy);
		int age=Integer.parseInt(ag);
		int matches=Integer.parseInt(mtch);
		int bestscore=Integer.parseInt(bs);
		
		TeamDto te= new TeamDto();
		te.setJersyno(jersyno);
		te.setName(nm);
		te.setAge(age);
		te.setMatches(matches);
		te.setRole(rl);
		te.setBestscore(bestscore);
		
		BcciDao bd = new BcciDao();
		bd.Update(te);
		
		List<TeamDto> l = bd.fetchall();
		req.setAttribute("objects", l);
		RequestDispatcher rqd = req.getRequestDispatcher("admin_fetchall.jsp");
		rqd.forward(req, resp);
		
		
	}
}
