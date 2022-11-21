<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>CMS</title>
</head>
<body>
     <%@ include file="header.jsp"%>
<div>
<h1>Courses List</h1>
    <ul>
     <c:forEach var="Course" items="${ Courses }">
     <div class="row">
    <div class="col "><c:out value="${ Course.course_number }" /></div>
    <div class="col "><c:out value="${ Course.course_name }" /></div>
    <div class="col "> <c:out value="${ Course.course_description}" /></div>
    <div class="col "> <c:out value="${ Course.instructor_no}" /></div>
        <div class="col "> <c:out value="${ Course.course_image}" /></div>
    
    
    <div class="col ">
    <form action="${pageContext.request.contextPath}/CourseDelete" method="post">
      <button type="submit" class="btn-danger" name="course_number" value=${ Course.course_number} > Delete</button>
</form>
    </div>
  </div>
        </c:forEach>
    </ul>  
    </div>
      
</body>
</html>