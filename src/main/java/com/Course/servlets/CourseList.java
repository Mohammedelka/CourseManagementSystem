package com.Course.servlets;

import java.io.IOException;

import com.Course.dao.DaoFactory;
import com.Course.dao.CourseDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseList
 */
public class CourseList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CourseDAO CourseDao;
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();
	        this.CourseDao = daoFactory.getCourseDao();
	    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
        request.setAttribute("Courses", CourseDao.lister());
	    RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/CourseList.jsp");  
	    rd.forward(request, response);         
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
