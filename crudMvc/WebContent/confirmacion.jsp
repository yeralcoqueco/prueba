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
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<script src="js/script.js"></script>
<body class="bg-dark">

	<div class="modal" id="mostrarmodal" tabindex="-1" role="dialog"
		data-backdrop="static">
		<div class="modal-dialog" id="modal" data-backdrop="static">
			<div class="modal-content" data-backdrop="static">
				<div class="modal-header red">
					<h3>EXITOSO</h3>
				</div>
				<div class="modal-footer">
					<a href="index" class="btn btn-danger">Aceptar</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>