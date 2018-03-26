<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>CRUD</title>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/script.js"></script>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-dark">


	<div class="container m-3 d-flex justify-content-center">
		<div class="card border-primary" style="width: 50rem;">
			<div class="card-body ">
				<form action="insertar" method="post">
					<div class="from-group justify-content-center m-3 ">
						<div class="form-row">
							<div class="form-group col-md-4">
								<label for="inputCedula">Cedula</label> <input type="text"
									class="form-control" id="inputCedula" name="cedula"
									placeholder="Cedula" required onKeyPress="return SoloNumeros(event);" maxlength="10" >
							</div>
							<div class="form-group col-md-4">
								<label for="inputNombre">Nombre</label>
									<input type="text" class="form-control" id="inputNombre" name="nombre"
									placeholder="Nombre" required onkeypress="return soloLetras(event);" maxlength="25" >
							</div>
							<div class="form-group col-md-4">
								<label for="inputApellido">Apellido</label> <input type="text"
									class="form-control" id="inputApellido" name="apellido"
									placeholder="Apellido" required onkeypress="return soloLetras(event);" maxlength="35" >
							</div>
							<div class="form-group col-md-4">
								<label for="inputEdad">Edad</label> <input type="text"
									class="form-control" id="inputEdad" name="edad"
									placeholder="Edad" required onKeyPress="return SoloNumeros(event);" maxlength="2" >
							</div>
							<div class="form-group col-md-4">
								<label for="inputDep">Departamento</label> 
								<select id="inputDep"
									class="form-control">
									<option selected>Departamento</option>
									<c:forEach items="${listaDpto}" var="dpto">
									<option value="${dpto.id}">${dpto.descripcion}</option>
									</c:forEach>
						
								</select>
							</div>
							<div class="form-group col-md-4">
								<label for="inputCiudad">Ciudad</label> <select id="inputCiudad" name="id_ciudad"
									class="form-control">
									<option selected>Ciudad</option>
									<c:forEach items="${listaCiudad}" var="ciu">
									<option value="${ciu.id }">${ciu.descripcion }</option>
									</c:forEach>
									
									
								</select>
							</div>
						</div>
						<div style="float: right">
							<button type="submit" class="btn btn-primary pull-right">Insertar</button>
						</div>
					</div>
				</form>
			</div>

			<table class="table table-hover table-dark">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Cedula</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido</th>
						<th scope="col">Edad</th>
						<th scope="col">Ciudad</th>
					</tr>
				</thead>
				<c:forEach items="${lista}" var="per">
					<tr>
						<td>${per.id}</td>
						<td>${per.cedula}</td>
						<td>${per.nombre}</td>
						<td>${per.apellido}</td>
						<td>${per.edad}</td>
						<td>${per.id_ciudad }</td>
						<td><a href="eliminar?id=${per.id}" class="btn btn-danger">Eliminar</a></td>
						<td><a href="modificar?id=${per.id}" class="btn btn-warning">Modificar</a></td>
					</tr>
				</c:forEach>

			</table>

		</div>
	</div>



</body>
</html>