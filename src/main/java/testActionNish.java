import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testActionNish extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		System.out.println("test");
		PrintWriter out = resp.getWriter();
		
		String r = req.getParameter("nish");
		out.println(r);
	    out.println("i am now here successfully");
	}
	
}
