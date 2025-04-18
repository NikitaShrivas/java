package com.rays.Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rays.bean.UserBean;
import com.rays.model.UserModel;

@WebServlet("/UserCtl.do")
public class UserCtl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		System.out.println("id = " + id);
		UserModel model = new UserModel();
		UserBean bean = new UserBean();

		if (id != null) {

			try {
				bean = model.findByPk(Integer.parseInt(id));
				request.setAttribute("bean", bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String op = request.getParameter("operation");

		UserBean bean = new UserBean();
		UserModel model = new UserModel();

		try {
			bean.setFirstName(request.getParameter("firstName"));
			bean.setLastName(request.getParameter("lastName"));
			bean.setLoginId(request.getParameter("loginId"));
			bean.setPassword(request.getParameter("password"));
			bean.setAddress(request.getParameter("address"));
			bean.setGender(request.getParameter("gender"));
			bean.setDob(sdf.parse(request.getParameter("dob")));

			if (op.equals("save")) {
				model.add(bean);
				request.setAttribute("msg", "user added successfully");
			} else if (op.equals("update")) {
				bean.setId(Integer.parseInt(request.getParameter("id")));
				model.update(bean);
				request.setAttribute("msg", "user updated successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("UserView.jsp");
		rd.forward(request, response);

	}
}