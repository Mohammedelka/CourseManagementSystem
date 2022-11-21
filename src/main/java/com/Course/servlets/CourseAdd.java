package com.Course.servlets;

import java.io.IOException;

import com.Course.beans.Course;
import com.Course.dao.CourseDAO;
import com.Course.dao.DaoFactory;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseAdd
 */
public class CourseAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CourseDAO CourseDao;
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();
	        this.CourseDao = daoFactory.getCourseDao();
	    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/CourseAdd.jsp");  
		    rd.forward(request, response);   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Course course = new Course();
	        course.setCourse_name(request.getParameter("course_name"));
	        course.setInstructor_no(request.getParameter("instructor_no"));
	        course.setCourse_description(request.getParameter("course_description"));
	        course.setCourse_image(request.getParameter("course_image"));
	        CourseDao.ajouter(course);
	        request.setAttribute("Courses", CourseDao.lister());
	        this.getServletContext().getRequestDispatcher("/WEB-INF/CourseList.jsp").forward(request, response);
	    }	}


