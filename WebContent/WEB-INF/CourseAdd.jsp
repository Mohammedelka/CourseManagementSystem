<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <%@ include file="header.jsp"%>
<div>
<form method="post">
  <div class="mb-3">
    <label for="course_name" class="form-label">course_name</label>
    <input type="text" class="form-control" name="course_name" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
        <label for="course_description" class="form-label">course_description</label>
    <input type="text" class="form-control" name="course_description" aria-describedby="emailHelp">
  </div>
  <div class="mb-3">
     <label for="course_image" class="form-label">course_image</label>
    <input type="text" class="form-control" name="course_image" >
  </div>
  <div class="mb-3">
     <label for="instructor_no" class="form-label">instructor_no</label>
    <input type="text" class="form-control" name="instructor_no" >
  </div>

  <button type="submit" class="btn btn-primary">confirmer</button>
      <a class="btn btn-primary" href="">annuler</a>
    
  </div>
  
</form>
</body>
</html>