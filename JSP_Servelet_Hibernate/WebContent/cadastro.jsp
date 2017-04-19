<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<link rel ="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" />

</head>
<body>
		
		<div class="container">
		
		<div class="well">
		<h3>Cadastro de Clientes</h3>
		<a href="index.jsp">Inicial</a>
		&nbsp; | &nbsp;
		<a href="cadastro.jsp">Cadastro</a>
		&nbsp; | &nbsp;
		<a href="#">Consulta</a>
		
		</div>
		
		${msg}
		
		<form method="post" action="clientecontrol">
		<fieldset style="width: 35%">
		
		<legend>Informe os dados do Cliente</legend>
		
		Nome:<br/>
		<input name="nome" placeholder="Informe o nome" required="required" size="30 " />
		<br/><br/>
		
		Email:<br/>
		<input name="email" placeholder="Informe o e-mail" size="30 " />
		<br/><br/>
		
		CPF:<br/>
		<input type="text" placeholder="Informe o CPF" 
		name="cpf" required="required"
		pattern="\d{3}\.\d{3}\.\d{3}\-\d{2}" 
		title="Formato CPF:999.999.999-99" 
		size="20" />
		<br/><br/>
		
		Gênero:<br/>
		<input type="radio" name="sexo"title="Selecione o Genero" value="m"/>Masculino
		<input type="radio" name="sexo"title="Selecione o Genero" value="f"/>Feminino
		<br/><br/>
		
		Nascimento:<br/>
		<input type="date" name="nascimento" required="required" size="15"/>
		<br/><br/>
		
		QTD Dependentes:<br/>
		<input type="number" name="qtddependente" min="1" max="5"/>
		<br/><br/>
		
		<input type="submit" value="Cadastrar" class="btn btn-primary"/>
		<input type="reset" value="Limpar Campos" class="btn btn-info"/>
		</fieldset>
		</form>	
		
		</div>

</body>
</html>