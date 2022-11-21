package com.Course.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Course.beans.Course;
public class CourseDaoImpl  implements CourseDAO {
	    private DaoFactory daoFactory;
	    CourseDaoImpl(DaoFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }

	    @Override
	    public void ajouter(Course course ) {
	        Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO Course VALUES(?,?, ?, ?, ?);");
	            preparedStatement.setString(1, null);
	            preparedStatement.setString(2,course.getCourse_name());
	            preparedStatement.setString(3,course.getInstructor_no());
	            preparedStatement.setString(4,course.getCourse_description());
	            preparedStatement.setString(5,course.getCourse_image());

	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println();
	        }

	    }
	    @Override
	    public void supprimer(int course_number ) {
	    	 Connection connexion = null;
		        PreparedStatement preparedStatement = null;

		        try {
		            connexion = daoFactory.getConnection();
		            preparedStatement = connexion.prepareStatement("DELETE FROM Course WHERE course_number=?;");
		            preparedStatement.setInt(1, course_number);
		            preparedStatement.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
	    }
	    @Override
	    public Course rechercher( int course_number  )  {
	    	 Connection connexion = null;			
	                     try {
	                         connexion = daoFactory.getConnection();
							 PreparedStatement statement = connexion.prepareStatement("SELECT * from Course WHERE  course_number = ?;");
				        	 statement.setInt(1,course_number);
				        	 ResultSet resultat = statement.executeQuery();
				        	 resultat.next();
					         Course Course = new Course();
				             Course.setCourse_number(course_number);
			                String course_name = resultat.getString("course_name");
			                Course.setCourse_name(course_name);
			                String instructor_no = resultat.getString("instructor_no");
			                Course.setInstructor_no(instructor_no);
			                String course_image = resultat.getString("course_image");
			                Course.setCourse_image(course_image);
			                String course_description = resultat.getString("course_description");
			                Course.setCourse_description(course_description);
		                     return Course;
	                     }
	              
	                     // Catch block to handle exceptions
	                     catch (SQLException e) {
	              
	                         // Print the exception
	                         System.out.println(e);
	                     }
						return null;
					
		           
		        }
	    
	    public void modifier( Course course ) {
	    	String sql = "UPDATE Course SET course_name=?, course_description=?, course_image=?,instructor_no=? WHERE course_number=? ;";
	    	 Connection connexion = null;
		        try {
		            connexion = daoFactory.getConnection();
			    	PreparedStatement statement = connexion.prepareStatement(sql);
			    	statement.setString(1, course.getCourse_name());
			    	statement.setString(2, course.getCourse_description());
			    	statement.setString(3, course.getCourse_image());
			    	statement.setString(4, course.getInstructor_no());
			    	statement.setInt(5, course.getCourse_number());

			    	statement.executeUpdate();
		            } catch (SQLException e) {
		            e.printStackTrace();
		        }
	    }
	    @Override
	    public List<Course> lister() {
	        List<Course> Courses = new ArrayList<Course>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT * FROM Course;");
	      
	    	    
	            while (resultat.next()) {
	            	Course Course = new Course();
	            	 int course_number = resultat.getInt("course_number");
		                Course.setCourse_number(course_number);
	                String course_name = resultat.getString("course_name");
	                Course.setCourse_name(course_name);
	                String instructor_no = resultat.getString("instructor_no");
	                Course.setInstructor_no(instructor_no);
	                String course_image = resultat.getString("course_image");
	                Course.setCourse_image(course_image);
	                String course_description = resultat.getString("course_description");
	                Course.setCourse_description(course_description);
	                Courses.add(Course);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return Courses;
	    }

	}

