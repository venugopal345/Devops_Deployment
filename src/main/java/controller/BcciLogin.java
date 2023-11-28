package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bccilogin")
public class BcciLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String eml = req.getParameter("email");
		String pd = req.getParameter("pwd");
		
		
		if(eml.equals("binny@gmail.com") && (pd.equals("binny123")))
		{
			resp.sendRedirect("options.html");
		}
		else
		{
			resp.getWriter().print("Enter valid data");
		}
	}
}
