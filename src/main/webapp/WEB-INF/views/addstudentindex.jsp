<%-- 
    Document   : addstudentindex
    Created on : 22-may-2019, 19:03:45
    Author     : Rodrigo Borjas
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta charset="UTF-8">
    <title>University Managment</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="/trabajofinal/css/main.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </head>
<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="index">University Managment</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="index"> Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item dropdown active">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" 
             data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Get Information</a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="alumnos">Students Info</a>
            <a class="dropdown-item" href="instructor">Instructors Info</a>
            <a class="dropdown-item" href="section">Section Info</a>
            <a class="dropdown-item" href="course">Course Info</a>
        </div>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="addstudentpage">Add Student<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="addcoursepage">Add Course<span class="sr-only">(current)</span></a>
        </li>
    </ul>
    </div>
  </nav>
      <hr>
      <h2 class="text-center">Add a Student</h2>
      <hr>
  <div class="row">
  <div class="col-3"></div>
  <div class="col-6">
  <form action="index" method="post">
    
    <div class="form-group">
      <label for="ID">ID:</label>
      <input type="ID" name="ID" id="ID"
      class="form-control" value="">
    </div>
    <div class="form-group">
      <label for="ID">NAME:</label>
      <input type="ID" name="ID" id="ID"
      class="form-control" value="">
    </div>
    <div class="form-group">
      <label for="ID">DEPARTMENT NAME:</label>
      <input type="ID" name="ID" id="ID"
      class="form-control" value="">
    </div>
    <div class="form-group">
      <label for="ID">TOTAL CREDITS BY NOW:</label>
      <input type="ID" name="ID" id="ID"
      class="form-control" value="">
    </div>
    <div class="form-group">
      <input type="submit" name="botonTocado" value="Add Student" class="btn btn-success">
    </div>
      
      
   </form>
  
</div>
   <!--FOOTER-->
  <!--DETAILS MODAL-->
  <div class="col-md-3"></div>
  </div>
<footer class="text-center" id="footer"> &copy; Copyright 2013-2019 University Managment</footer>

  </body>
</html>