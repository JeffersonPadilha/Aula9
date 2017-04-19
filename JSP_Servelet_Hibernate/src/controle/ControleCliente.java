package controle;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Cliente;
import persistencia.ClienteDAO;


@WebServlet("/clientecontrol")
public class ControleCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
    public ControleCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Cliente cliente = new Cliente(null,
					request.getParameter("nome"),
					request.getParameter("email"),
					request.getParameter("cpf"),
					request.getParameter("sexo"),
					new SimpleDateFormat("yyy-MM-dd").parse(request.getParameter("nascimento")),
					Integer.parseInt(request.getParameter("qtddependente")));
			
			new ClienteDAO().inserir(cliente);
			
			request.setAttribute("msg","Cliente Cadastrado!");
			
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
		}
		
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		doGet(request, response);
	}

}
