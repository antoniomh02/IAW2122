<!doctype html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Listar Juegos</title>
  </head>
  <body>
    <div class="container">
    	<div class="row">
    		<div class="col">
    			<h2>Buscar juego</h2>
    			<form role="form"  method="post" action="ValidarJuego">
				  <div class="mb-3">
				    <label for="name" class="form-label">Nombre</label>
				    <input type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" autofocus="autofocus" required="required">				    
				  </div>
				  <div class="mb-3">
				    <label for="company" class="form-label">Company</label>
				    <input type="text" class="form-control" id="company" name="company" required="required">
				  </div>
				  <button type="submit" class="btn btn-primary">Entrar</button>
				  </form>
				  <%
				String mensaje = request.getParameter("mensaje");
				if (mensaje != null) {
				%>
				<div class="alert alert-warning alert-dismissible fade show" role="alert">
				  <%=mensaje %> 
				  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
				<%
				}
				%>
    		</div>
    	</div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
  </body>
</html>