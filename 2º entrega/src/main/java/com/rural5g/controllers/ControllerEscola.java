package com.rural5g.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rural5g.dao.AlunoDAO;
import com.rural5g.dao.EscolaDAO;
import com.rural5g.model.Escola;

/**
 * Servlet implementation class ControllerEscola
 */

@WebServlet(urlPatterns = { "/ControllerEscola", "/tabelas/escola/create", "/tabelas/escola/update",
		"/tabelas/escola/delete" })
public class ControllerEscola extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	Escola escola = new Escola();

	public ControllerEscola() {
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
			createEscola(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/escola/create")) {
			createEscola(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/escola/update")) {
			updateEscola(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/escola/delete")) {
			deleteEscola(request, response);
		}
//		doGet(request, response);
	}

	protected void createEscola(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		escola.setNome(request.getParameter("nome"));
		escola.setNome_coordenador(request.getParameter("nome_coordenador"));
		escola.setEstado(request.getParameter("estado"));
		escola.setCidade(request.getParameter("cidade"));
		escola.setBairro(request.getParameter("bairro"));

		EscolaDAO.insert(escola);

		response.sendRedirect("Escola.jsp");

	}

	protected void updateEscola(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		escola.setId_escola(Integer.parseInt(request.getParameter("id_escola")));
		escola.setNome(request.getParameter("nome"));
		escola.setNome_coordenador(request.getParameter("nome_coordenador"));
		escola.setEstado(request.getParameter("estado"));
		escola.setCidade(request.getParameter("cidade"));
		escola.setBairro(request.getParameter("bairro"));

		EscolaDAO.update(escola);

		response.sendRedirect("Escola.jsp");

	}

	protected void deleteEscola(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EscolaDAO.deleteById(Integer.parseInt(request.getParameter("id_escola")));

		response.sendRedirect("Escola.jsp");

	}

}
