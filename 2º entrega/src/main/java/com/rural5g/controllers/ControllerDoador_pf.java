package com.rural5g.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rural5g.dao.Doador_pfDAO;
import com.rural5g.model.Doador_pf;

/**
 * Servlet implementation class ControllerDoador_pj
 */
@WebServlet(urlPatterns = { "/ControllerDoador_pf", "/tabelas/doador_pf/create", "/tabelas/doador_pf/update",
		"/tabelas/doador_pf/delete" })
public class ControllerDoador_pf extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	Doador_pf doador = new Doador_pf();
	public ControllerDoador_pf() {
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

		if (action.equalsIgnoreCase("/tabelas/doador_pf/create")) {
			createDoador_pj(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/doador_pf/update")) {
			updateDoador_pj(request, response);
		} else if (action.equalsIgnoreCase("/tabelas/doador_pf/delete")) {
			deleteDoador_pj(request, response);
		}
		doGet(request, response);
	}

	protected void createDoador_pj(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doador.setNome(request.getParameter("nome"));
		doador.setEmail(request.getParameter("email"));
		doador.setCelular(request.getParameter("celular"));
		doador.setCpf(request.getParameter("cpf"));

		Doador_pfDAO.insert(doador);

		response.sendRedirect("Doador_pf.jsp");

	}

	protected void updateDoador_pj(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doador.setId_doador(Integer.parseInt(request.getParameter("id_doador_pf")));
		doador.setNome(request.getParameter("nome"));
		doador.setEmail(request.getParameter("email"));
		doador.setCelular(request.getParameter("celular"));
		doador.setCpf(request.getParameter("cpf"));

		Doador_pfDAO.update(doador);

		response.sendRedirect("Doador_pf.jsp");;

	}

	protected void deleteDoador_pj(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Doador_pfDAO.deleteById(Integer.parseInt(request.getParameter("id_doador_pf")));

		response.sendRedirect("Doador_pf.jsp");

	}

}
