package com.rural5g.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rural5g.dao.DoacaoDAO;
import com.rural5g.model.Doacao;

/**
 * Servlet implementation class ControllerDoacao
 */
@WebServlet(urlPatterns = { "/ControllerDoacao", "/tabelas/doacao/create", "/tabelas/doacao/update",
		"/tabelas/doacao/delete" })
public class ControllerDoacao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	Doacao doacao = new Doacao();

	public ControllerDoacao() {
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
		// TODO Auto-generated method stub
		String action = request.getServletPath();

		if (action.equalsIgnoreCase("/tabelas/doacao/create")) {
			createDoacao(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/doacao/update")) {
			updateAluno(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/doacao/delete")) {
			deleteAluno(request, response);
		}
//		doGet(request, response);
	}

	protected void createDoacao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doacao.setNome(request.getParameter("nome"));
		doacao.setId_escola(Integer.parseInt(request.getParameter("id_escola")));
		doacao.setId_doador(Integer.parseInt(request.getParameter("id_doador")));
		doacao.setEntidade_doador(request.getParameter("entidade_doador"));

		DoacaoDAO.insert(doacao);

		response.sendRedirect("Doacao.jsp");

	}

	protected void updateAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doacao.setId_doacao(Integer.parseInt(request.getParameter("id_doacao")));
		doacao.setNome(request.getParameter("nome"));
		doacao.setId_escola(Integer.parseInt(request.getParameter("id_escola")));
		doacao.setId_doador(Integer.parseInt(request.getParameter("id_doador")));
		doacao.setEntidade_doador(request.getParameter("entidade_doador"));

		DoacaoDAO.update(doacao);

		response.sendRedirect("Doacao.jsp");

	}

	protected void deleteAluno(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DoacaoDAO.deleteById(Integer.parseInt(request.getParameter("id_doacao")));

		response.sendRedirect("Doacao.jsp");

	}
}
