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
 * Servlet implementation class CourseUpdate
 */
public class CourseUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CourseDAO CourseDao;
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();
	        this.CourseDao = daoFactory.getCourseDao();
	    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        this.getServletContext().getRequestDispatcher("/WEB-INF/CourseUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

        if ("rechercher".equals(action)) {
            int course_number  =Integer.parseInt(request.getParameter("course_number"));
    		Course Course=CourseDao.rechercher(course_number);
	        request.setAttribute("Course", Course);
 			response.getWriter().append("update done: ").append(request.getContextPath());
	        doGet(request, response);
        }
         else {
        	Course course = new Course();
 	        course.setCourse_number(Integer.parseInt(request.getParameter("course_number")));
 	        course.setCourse_name(request.getParameter("course_name"));
 	        course.setInstructor_no(request.getParameter("instructor_no"));
 	        course.setCourse_description(request.getParameter("course_description"));
 	        course.setCourse_image(request.getParameter("course_image"));
 	        CourseDao.modifier(course);
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/CourseUpdate.jsp").forward(request, response);

	}

}
