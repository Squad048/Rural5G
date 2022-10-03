<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.rural5g.model.Professor"%>
<%@ page import="com.rural5g.dao.ProfessorDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professor | Rural 5G</title>
<link rel="stylesheet" href="../novomenu.css">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon" type="image/x-icon"
	href="../../assets/images/favicon.ico">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<link rel="stylesheet" href="../../assets/css/style.css">

</head>
<body>
	<header>
		<!--Sessão Menu Principal-->
		<div id="menu-principal">
			<h1>
				<nav class="dp-menu">

					<ul>

						<li><a href="index.html">Home</a></li>

						<li><a href="#">Colaboradores</a>
							<ul>
								<li><a href="voluntarios.html">Voluntários</a></li>
								<li><a href="doacao.html">Doação</a></li>
								<li><a href="cadastrarescola.html">Cadastrar minha
										escola</a></li>

							</ul></li>
						<li><a href="sobre.html">O projeto</a></li>
						<li><a href="contato.html">Contato</a></li>
						<li><a href="./login.html" id="botao-login"
							class="btn btn-success sistema">Login</a></li>

					</ul>
				</nav>
			</h1>
			</nav>
		</div>

		<!--Fim Menu Principal-->
	</header>
	<section class="container p-5">
		<div class="d-flex flex-row-reverse">
			<button class="btn btn-danger" data-toggle="modal"
				data-target="#modalCreate">Cadastrar Professor</button>
		</div>
		<h1 class="text-center">Professores:</h1>
		<table class="table table-bordered table-hover table-danger p-5">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>CPF</th>
					<th>Celular</th>
					<th>Email</th>
					<th>Estado</th>
					<th>Cidade</th>
					<th>Bairro</th>
					<th>Matéria</th>
					<th>Opções</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Professor professor : ProfessorDAO.getProfessores()) {
				%>
				<tr>
					<td><%=professor.getId_professor()%></td>
					<td><%=professor.getNome()%></td>
					<td><%=professor.getCpf()%></td>
					<td><%=professor.getCelular()%></td>
					<td><%=professor.getEmail()%></td>
					<td><%=professor.getEstado()%></td>
					<td><%=professor.getCidade()%></td>
					<td><%=professor.getBairro()%></td>
					<td><%=professor.getMateria()%></td>
					<td><button type="button" class="btn btn-danger"
							data-toggle="modal" data-target="#modalUpdate">Editar</button>
						<button href="#" class="btn btn-warning" data-toggle="modal"
							data-target="#modalDelete">Excluir</button></td>

				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</section>

	<footer class="fixed-bottom">
		<div class="rodape">
			<p>© SQUAD 48 - RECODE PRO, 2022.</p>
		</div>
	</footer>

	<!-- Modais -->
	<div class="modal modal-signin fade" tabindex="-1" role="dialog"
		id="modalDelete">
		<div class="modal-dialog" role="document">
			<div class="modal-content rounded-4 shadow">
				<div class="modal-header p-5 pb-4 border-bottom-0">
					<!-- <h5 class="modal-title">Modal title</h5> -->
					<h2 class="fw-bold mb-0">Excluir</h2>
					<button type="button" class="btn-close" data-dimiss="modal"
						data-dismiss="modal" aria-label="Close"></button>
				</div>

				<div class="modal-body p-5 pt-0">
					<form class="" method="post" action="delete">
						<div class="form-floating mb-3">
							<input type="text" name="id_professor"
								class="form-control rounded-3" id="floatingInputL"
								placeholder="ID"> <label for="floatingInput">Digite
								o id do professor que deseja excluir</label>
						</div>

						<button class="w-100 mb-2 btn btn-lg rounded-3 btn-danger"
							type="submit">Excluir</button>

					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="modal modal-signin fade" tabindex="-1" role="dialog"
		id="modalUpdate">
		<div class="modal-dialog" role="document">
			<div class="modal-content rounded-4 shadow">
				<div class="modal-header p-5 pb-4 border-bottom-0">
					<!-- <h5 class="modal-title">Modal title</h5> -->
					<h2 class="fw-bold mb-0">Editar</h2>
					<button type="button" class="btn-close" data-dimiss="modal"
						data-dismiss="modal" aria-label="Close"></button>
				</div>

				<div class="modal-body p-5 pt-0">
					<form class="" action="update" method="post">
						<div class="form-floating mb-3">
							<input type="text" name="id_professor"
								class="form-control rounded-3" id="floatingInputL"> <label
								for="floatingInput">Digite o ID do professor</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="nome" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o nome</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="cpf" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o CPF</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="email" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o email</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="celular" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o celular</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="estado" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o estado</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="cidade" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								a cidade</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="bairro" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o bairro</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="materia" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o materia</label>
						</div>
						<button class="w-100 mb-2 btn btn-lg rounded-3 btn-danger"
							type="submit">Editar</button>

					</form>
				</div>
			</div>
		</div>
	</div>

	<div class="modal modal-signin fade" tabindex="-1" role="dialog"
		id="modalCreate">
		<div class="modal-dialog" role="document">
			<div class="modal-content rounded-4 shadow">
				<div class="modal-header p-5 pb-4 border-bottom-0">
					<!-- <h5 class="modal-title">Modal title</h5> -->
					<h2 class="fw-bold mb-0">Cadastrar</h2>
					<button type="button" class="btn-close" data-dimiss="modal"
						data-dismiss="modal" aria-label="Close"></button>
				</div>

				<div class="modal-body p-5 pt-0">
					<form class="" action="create" method="post">
						<div class="form-floating mb-3">
							<input type="text" name="nome" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o nome</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="cpf" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o CPF</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="email" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o email</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="celular" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o celular</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="estado" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o estado</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="cidade" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								a cidade</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="bairro" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o bairro</label>
						</div>
						<div class="form-floating mb-3">
							<input type="text" name="materia" class="form-control rounded-3"
								id="floatingInputL"> <label for="floatingInput">Digite
								o materia</label>
						</div>
						<button class="w-100 mb-2 btn btn-lg rounded-3 btn-danger"
							type="submit">Cadastrar</button>

					</form>
				</div>
			</div>
		</div>
	</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>