<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>update form</title>
</head>
<body>
     <%@ include file="header.jsp"%>
<div>
<form method="post">
  <div class="mb-3">
    <label for="course_number" class="form-label">course_number</label>
    <input type="text" class="form-control" name="course_number" value=${Course.course_number} >
  </div>
  <div class="mb-3">
    <label for="course_name" class="form-label">course_name</label>
    <input type="text" class="form-control" name="course_name" value=${Course.course_name} >
  </div>
  <div class="mb-3">
        <label for="course_description" class="form-label">course_description</label>
    <input type="text" class="form-control" name="course_description" value=${Course.course_description} >
  </div>
  <div class="mb-3">
     <label for="course_image" class="form-label">course_image</label>
    <input type="text" class="form-control" name="course_image" value=${Course.course_image} >
  </div>
  <div class="mb-3">
     <label for="instructor_no" class="form-label">instructor_no</label>
    <input type="text" class="form-control" name="instructor_no" value=${Course.instructor_no} >
  </div>
  <button type="submit" class="btn btn-primary" name="action" value="rechercher" >rechercher</button>
  <button type="submit" class="btn btn-primary" name="action" value="modifier" >modifier</button>
</form>
</div>

</body>
</html>