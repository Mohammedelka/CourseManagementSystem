package com.Course.dao;
import java.sql.SQLException;
import java.util.List;

import com.Course.beans.Course;

public interface CourseDAO {
    void ajouter( Course freelancer );
    void supprimer( int course_number);
    Course rechercher(  int course_number  ) ;
    void modifier( Course course );

    List<Course> lister();
}




