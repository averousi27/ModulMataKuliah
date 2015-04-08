<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Menu Kurikulum</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>" type="text/css" />
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
    </head>
    
    <body> 
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#">Brand</a>
		    </div>
		
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
		        <li><a href="#">Link</a></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
		          <ul class="dropdown-menu" role="menu">
		            <li><a href="#">Action</a></li>
		            <li><a href="#">Another action</a></li>
		            <li><a href="#">Something else here</a></li>
		            <li class="divider"></li>
		            <li><a href="#">Separated link</a></li>
		            <li class="divider"></li>
		            <li><a href="#">One more separated link</a></li>
		          </ul>
		        </li>
		      </ul>
		      <form class="navbar-form navbar-left" role="search">
		        <div class="form-group">
		          <input type="text" class="form-control" placeholder="Search">
		        </div>
		        <button type="submit" class="btn btn-default">Submit</button>
		      </form>
		      <ul class="nav navbar-nav navbar-right">
		        <li><a href="#">Link</a></li>
		      </ul>
		    </div>
		  </div>
		</nav>
    	<!-- <h1>Hello World! ${message}</h1> -->
    	<h1>Menu Kurikulum</h1>
    	<a href="tambah" class="btn btn-success">Tambah Kurikulum</a>
    	<form id="myObject" action="showKurikulum" method="get">
    	<table class="table table-striped table-hover ">
			  <thead>
			    <tr>
			      <th>ID Kurikulum</th>
			      <th>Tahun Mulai</th>
			      <th>Tahun Akhir</th>
			      <th>Status Kurikulum</th>
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${kurikulums}" var="kurikulum">
			    <tr>
			      <td>${kurikulum.idKurikulum}</td>
			      <td>${kurikulum.tahunMulai}</td>
			      <td>${kurikulum.tahunAkhir}</td>
			      <td>${kurikulum.statusKurikulum}</td>
			      <td><a href="kurikulum/${kurikulum.idKurikulum}" class="btn btn-success">Ubah</a></td>
			      <td><a href="kurikulum/ubahkurikulum/${kurikulum.idKurikulum}" class="btn btn-danger">Non-Aktif</a></td>
			    </tr>
			    </c:forEach>
			  </tbody>
		</table>
		</form>
	</body>
</html>
