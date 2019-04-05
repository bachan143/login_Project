package login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.db.Users;
import login.model.UserDao;

public class Login extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Users u=new Users();
		u.setEmail(request.getParameter("username"));
		u.setPassword(request.getParameter("pas"));
		int status=UserDao.save(u);
		if(status>0)
			out.println("register successfull"+status);
		
	}

}
