package edu.tongji.yuexiarenjing.testjson;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import net.sf.json.JSONObject;

public class HelloWorld extends HttpServlet {

	private String message;
	private Product product;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		message = "Hello World";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("application/json; charset=utf-8");
		PrintWriter out = resp.getWriter();
		product = new Product(1, "zhang", 23);
		JSONObject obj = JSONObject.fromObject(product);
		out.print(obj);
		out.flush();
		out.close();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
