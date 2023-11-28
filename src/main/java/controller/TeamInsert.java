package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TeamDao;
import Dto.TeamDto;

@WebServlet("/teaminsert")
public class TeamInsert extends HttpServlet
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
		
		int jersy = Integer.parseInt(jrcy);
		int age=Integer.parseInt(ag);
		int matches=Integer.parseInt(mtch);
		int bestscore=Integer.parseInt(bs);
		
		TeamDto te= new TeamDto();
		te.setJersyno(jersy);
		te.setName(nm);
		te.setAge(age);
		te.setMatches(matches);
		te.setRole(rl);
		te.setBestscore(bestscore);
		
		TeamDao td = new TeamDao();
		td.insert(te);
		resp.getWriter().print("Data Inserted");
		
	}
}
