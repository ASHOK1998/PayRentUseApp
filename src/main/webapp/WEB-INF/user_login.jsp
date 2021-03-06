<html>
<head>
<title>login form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body class="mt-5">
	<div class="container text-center">
	<h1 class="align-center mx-5">Login</h1>
	<form  method="post" class="text-lg-center" 
		action="${pageContext.request.contextPath}/loginUser">
		<p class="text-danger">${message}</p>
		<div class="form-group mx-5">
		<label>Email ID:</label>
		<input type="text" name="email" class="form-control-md"/>
		</div>
		
		<div class="form-group mx-5">
		<label>Password:</label>
		<input type="password" name="password" class="form-control-md"/>
		</div>
		<input type="submit" value="login" class="btn btn-primary text-center"/>&nbsp;<span> or </span>&nbsp;
		<a href="${pageContext.request.contextPath}/showUserForm" class="btn btn-outline-success text-center">Register</a>
		
		
	</form>
	
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>
</body>
</html>