package com.rural5g.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rural5g.dao.AlunoDAO;
import com.rural5g.model.Aluno;

/**
 * Servlet implementation class ControllerAluno
 */
@WebServlet(urlPatterns = { "/ControllerAluno", "/cadastroAluno", "/tabelas/aluno/create", "/tabelas/aluno/update", "/tabelas/aluno/delete" })
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	Aluno aluno = new Aluno();

	public ControllerAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		if (action.equalsIgnoreCase("/cadastroAluno")) {
			cadastroAluno(request, response);
		}else if (action.equalsIgnoreCase("/tabelas/aluno/create")) {
			createAluno(request, response);
		}else if (action.equalsIgnoreCase("/tabelas/aluno/update")) {
			updateAluno(request, response);
		}else if (action.equalsIgnoreCase("/tabelas/aluno/delete")) {
			deleteAluno(request, response);
		}
//		doGet(request, response);
	}
	
	protected void cadastroAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		aluno.setNome(request.getParameter("nome"));
		aluno.setEmail(request.getParameter("email"));
		aluno.setCpf(request.getParameter("cpf"));
		aluno.setEstado(request.getParameter("estado"));
		aluno.setCidade(request.getParameter("cidade"));
		aluno.setBairro(request.getParameter("bairro"));
		aluno.setCelular(request.getParameter("celular"));

		AlunoDAO.insert(aluno);

		response.sendRedirect("index.html");

	}


	protected void createAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		aluno.setNome(request.getParameter("nome"));
		aluno.setEmail(request.getParameter("email"));
		aluno.setCpf(request.getParameter("cpf"));
		aluno.setEstado(request.getParameter("estado"));
		aluno.setCidade(request.getParameter("cidade"));
		aluno.setBairro(request.getParameter("bairro"));
		aluno.setCelular(request.getParameter("celular"));

		AlunoDAO.insert(aluno);

		response.sendRedirect("Aluno.jsp");

	}
	
	protected void updateAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		aluno.setId_aluno(Integer.parseInt(request.getParameter("id_aluno")));
		aluno.setNome(request.getParameter("nome"));
		aluno.setEmail(request.getParameter("email"));
		aluno.setCpf(request.getParameter("cpf"));
		aluno.setEstado(request.getParameter("estado"));
		aluno.setCidade(request.getParameter("cidade"));
		aluno.setBairro(request.getParameter("bairro"));
		aluno.setCelular(request.getParameter("celular"));

		AlunoDAO.update(aluno);

		response.sendRedirect("Aluno.jsp");

	}
	
	protected void deleteAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		AlunoDAO.deleteById(Integer.parseInt(request.getParameter("id_aluno")));

		response.sendRedirect("Aluno.jsp");

	}
}
