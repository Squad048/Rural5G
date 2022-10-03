package com.rural5g.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rural5g.dao.VoluntarioDAO;
import com.rural5g.model.Voluntario;

/**
 * Servlet implementation class ControllerAluno
 */
@WebServlet(urlPatterns = { "/ControllerVoluntario", "/tabelas/voluntario/create", "/tabelas/voluntario/update",
		"/tabelas/voluntario/delete" })
public class ControllerVoluntario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	Voluntario voluntario = new Voluntario();

	public ControllerVoluntario() {
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
		if (action.equalsIgnoreCase("/tabelas/voluntario/create")) {
			createProfessor(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/voluntario/update")) {
			updateProfessor(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/voluntario/delete")) {
			deleteProfessor(request, response);
		}
//		doGet(request, response);
	}

	protected void createProfessor(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		voluntario.setNome(request.getParameter("nome"));
		voluntario.setEmail(request.getParameter("email"));
		voluntario.setCpf(request.getParameter("cpf"));
		voluntario.setEstado(request.getParameter("estado"));
		voluntario.setCidade(request.getParameter("cidade"));
		voluntario.setBairro(request.getParameter("bairro"));
		voluntario.setCelular(request.getParameter("celular"));
		voluntario.setFormacao(request.getParameter("formacao"));

		VoluntarioDAO.insert(voluntario);

		response.sendRedirect("Voluntario.jsp");

	}

	protected void updateProfessor(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		voluntario.setId_voluntario(Integer.parseInt(request.getParameter("id_voluntario")));
		voluntario.setNome(request.getParameter("nome"));
		voluntario.setEmail(request.getParameter("email"));
		voluntario.setCpf(request.getParameter("cpf"));
		voluntario.setEstado(request.getParameter("estado"));
		voluntario.setCidade(request.getParameter("cidade"));
		voluntario.setBairro(request.getParameter("bairro"));
		voluntario.setCelular(request.getParameter("celular"));
		voluntario.setFormacao(request.getParameter("formacao"));

		VoluntarioDAO.update(voluntario);

		response.sendRedirect("Voluntario.jsp");


	}

	protected void deleteProfessor(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		VoluntarioDAO.deleteById(Integer.parseInt(request.getParameter("id_voluntario")));

		response.sendRedirect("Voluntario.jsp");

	}
}
