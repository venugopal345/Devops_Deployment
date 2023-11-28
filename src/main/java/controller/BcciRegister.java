package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.BcciDao;
import Dto.BcciheadDto;

@WebServlet("/bcciregister")
public class BcciRegister extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String eml = req.getParameter("email");
		String pd = req.getParameter("pwd");
		
		BcciheadDto bt = new BcciheadDto();
		bt.setEmail(eml);
		bt.setPassword(pd);
		
		BcciDao bd = new BcciDao();
		bd.insert(bt);
		
		RequestDispatcher rd = req.getRequestDispatcher("bccilogin");
		rd.forward(req, resp);
		
		
	
		
	}
}
