package com.Course.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Course.beans.Course;
import com.Course.dao.DaoFactory;
import com.Course.dao.CourseDAO;

/**
 * Servlet implementation class CourseDelete
 */
public class CourseDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CourseDAO CourseDao;
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();
	        this.CourseDao = daoFactory.getCourseDao();
	    }       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                    int course_number  =Integer.parseInt(request.getParameter("course_number"));
			        CourseDao.supprimer(course_number);
			        request.setAttribute("Courses", CourseDao.lister());
			        this.getServletContext().getRequestDispatcher("/WEB-INF/CourseList.jsp").forward(request, response);
            		}

}
