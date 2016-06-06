package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello") // ①
public class HelloServlet extends HttpServlet { // ②

	private static final long serialVersionUID = 1L; // ③

	@Override // ④
	protected void doGet(HttpServletRequest request, // ⑤
						 HttpServletResponse response)
			throws ServletException, IOException {
		
		Date nowDate = new Date(); // ⑥

		PrintWriter out = response.getWriter(); // ⑦
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<p>Hello, World!</p>");
		out.println("<p>Now data : " + nowDate + "</p>"); // ⑧
		out.println("</body>");
		out.println("</html>");
	}
}
