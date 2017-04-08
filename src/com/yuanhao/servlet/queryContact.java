package com.yuanhao.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanhao.dao.impl.ContactDaoImpl;
import com.yuanhao.entity.Contact;

/**
 * Servlet implementation class updateContact
 */
@WebServlet("/queryContact")
public class queryContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public queryContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactDaoImpl contactDaoImpl = new ContactDaoImpl();
		String name = request.getParameter("name");
		Contact contact = contactDaoImpl.queryContact(name);
		if(contact!=null){
			request.setAttribute("contact", contact);
			request.getRequestDispatcher("/update.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
