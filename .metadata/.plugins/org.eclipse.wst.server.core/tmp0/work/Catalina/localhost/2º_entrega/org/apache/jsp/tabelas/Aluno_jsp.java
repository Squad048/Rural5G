/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-02 21:49:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tabelas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rural5g.model.Aluno;
import com.rural5g.dao.AlunoDAO;

public final class Aluno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.rural5g.dao.AlunoDAO");
    _jspx_imports_classes.add("com.rural5g.model.Aluno");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Aluno | Rural 5G</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../novomenu.css\">\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"../assets/images/favicon.ico\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css\">\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<!--Sess??o Menu Principal-->\r\n");
      out.write("		<div id=\"menu-principal\">\r\n");
      out.write("			<h1>\r\n");
      out.write("				<nav class=\"dp-menu\">\r\n");
      out.write("\r\n");
      out.write("					<ul>\r\n");
      out.write("\r\n");
      out.write("						<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("						<li><a href=\"#\">Colaboradores</a>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"voluntarios.html\">Volunt??rios</a></li>\r\n");
      out.write("								<li><a href=\"doacao.html\">Doa????o</a></li>\r\n");
      out.write("								<li><a href=\"cadastrarescola.html\">Cadastrar minha\r\n");
      out.write("										escola</a></li>\r\n");
      out.write("\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li><a href=\"sobre.html\">O projeto</a></li>\r\n");
      out.write("						<li><a href=\"contato.html\">Contato</a></li>\r\n");
      out.write("						<li><a href=\"./login.html\" id=\"botao-login\"\r\n");
      out.write("							class=\"btn btn-success sistema\">Login</a></li>\r\n");
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</h1>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!--Fim Menu Principal-->\r\n");
      out.write("	</header>\r\n");
      out.write("	<section class=\"container p-5\">\r\n");
      out.write("		<div class=\"d-flex flex-row-reverse\">\r\n");
      out.write("			<button class=\"btn btn-danger\" data-toggle=\"modal\"\r\n");
      out.write("				data-target=\"#modalCreate\">Cadastrar Aluno</button>\r\n");
      out.write("		</div>\r\n");
      out.write("		<h1 class=\"text-center\">ALUNOS:</h1>\r\n");
      out.write("		<table class=\"table table-bordered table-hover table-danger p-5\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>Id</th>\r\n");
      out.write("					<th>Nome</th>\r\n");
      out.write("					<th>CPF</th>\r\n");
      out.write("					<th>Celular</th>\r\n");
      out.write("					<th>Email</th>\r\n");
      out.write("					<th>Estado</th>\r\n");
      out.write("					<th>Cidade</th>\r\n");
      out.write("					<th>Bairro</th>\r\n");
      out.write("					<th>Op????es</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				");

				for (Aluno aluno : AlunoDAO.getAlunos()) {
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(aluno.getId_aluno());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getNome());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getCpf());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getCelular());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getEmail());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getEstado());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getCidade());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(aluno.getBairro());
      out.write("</td>\r\n");
      out.write("					<td><button type=\"button\" class=\"btn btn-danger\"\r\n");
      out.write("							data-toggle=\"modal\" data-target=\"#modalUpdate\">Editar</button>\r\n");
      out.write("						<button href=\"#\" class=\"btn btn-warning\" data-toggle=\"modal\"\r\n");
      out.write("							data-target=\"#modalDelete\">Excluir</button></td>\r\n");
      out.write("\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<footer class=\"fixed-bottom\">\r\n");
      out.write("		<div class=\"rodape\">\r\n");
      out.write("			<p>?? SQUAD 48 - RECODE PRO, 2022.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("	<!-- Modais -->\r\n");
      out.write("	<div class=\"modal modal-signin fade\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		id=\"modalDelete\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content rounded-4 shadow\">\r\n");
      out.write("				<div class=\"modal-header p-5 pb-4 border-bottom-0\">\r\n");
      out.write("					<!-- <h5 class=\"modal-title\">Modal title</h5> -->\r\n");
      out.write("					<h2 class=\"fw-bold mb-0\">Excluir</h2>\r\n");
      out.write("					<button type=\"button\" class=\"btn-close\" data-dimiss=\"modal\"\r\n");
      out.write("						data-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"modal-body p-5 pt-0\">\r\n");
      out.write("					<form class=\"\" method=\"post\" action=\"delete\">\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"id_aluno\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\" placeholder=\"ID\"> <label\r\n");
      out.write("								for=\"floatingInput\">Digite o id do aluno que deseja\r\n");
      out.write("								excluir</label>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<button class=\"w-100 mb-2 btn btn-lg rounded-3 btn-danger\"\r\n");
      out.write("							type=\"submit\">Excluir</button>\r\n");
      out.write("\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"modal modal-signin fade\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		id=\"modalUpdate\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content rounded-4 shadow\">\r\n");
      out.write("				<div class=\"modal-header p-5 pb-4 border-bottom-0\">\r\n");
      out.write("					<!-- <h5 class=\"modal-title\">Modal title</h5> -->\r\n");
      out.write("					<h2 class=\"fw-bold mb-0\">Editar</h2>\r\n");
      out.write("					<button type=\"button\" class=\"btn-close\" data-dimiss=\"modal\"\r\n");
      out.write("						data-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"modal-body p-5 pt-0\">\r\n");
      out.write("					<form class=\"\" action=\"update\" method=\"post\">\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"id_aluno\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o ID do aluno</label>\r\n");
      out.write("						</div><div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"nome\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o nome</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"cpf\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o CPF</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"email\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o email</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"celular\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o celular</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"estado\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o estado</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"cidade\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								a cidade</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"bairro\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o bairro</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button class=\"w-100 mb-2 btn btn-lg rounded-3 btn-danger\"\r\n");
      out.write("							type=\"submit\">Editar</button>\r\n");
      out.write("\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"modal modal-signin fade\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		id=\"modalCreate\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content rounded-4 shadow\">\r\n");
      out.write("				<div class=\"modal-header p-5 pb-4 border-bottom-0\">\r\n");
      out.write("					<!-- <h5 class=\"modal-title\">Modal title</h5> -->\r\n");
      out.write("					<h2 class=\"fw-bold mb-0\">Cadastrar</h2>\r\n");
      out.write("					<button type=\"button\" class=\"btn-close\" data-dimiss=\"modal\"\r\n");
      out.write("						data-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"modal-body p-5 pt-0\">\r\n");
      out.write("					<form class=\"\" action=\"create\" method=\"post\">\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"nome\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o nome</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"cpf\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o CPF</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"email\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o email</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"celular\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o celular</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"estado\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o estado</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"cidade\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								a cidade</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-floating mb-3\">\r\n");
      out.write("							<input type=\"text\" name=\"bairro\" class=\"form-control rounded-3\"\r\n");
      out.write("								id=\"floatingInputL\"> <label for=\"floatingInput\">Digite\r\n");
      out.write("								o bairro</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button class=\"w-100 mb-2 btn btn-lg rounded-3 btn-danger\"\r\n");
      out.write("							type=\"submit\">Cadastrar</button>\r\n");
      out.write("\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
