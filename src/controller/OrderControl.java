package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;

/**
 * Servlet implementation class OrderControl
 */
@WebServlet("/OrderControl")
public class OrderControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String CreditCardNumber = request.getParameter("ccn");
		String RepeatCCNubmer = request.getParameter("rccn");
		String page;
		
		String  Parameters[] = new String[8];
		String getParam[] = {"CardType", "pe", "mi", "in", "sa", "fn", "dc", "in"};
		for(int i = 0; i < getParam.length; i++) {
		  Parameters[i]= request.getParameter(getParam[i]);
	      if(Parameters[i] == "")
	        Parameters[i] = "No Value";
		}
		
		
		if(CheckCardNum(CreditCardNumber, RepeatCCNubmer)) {
			page="/view/order.jsp";
			
			Order order = new Order(CreditCardNumber, Parameters[0], Parameters[1], Parameters[2], Parameters[3], Parameters[4], Parameters[5], Parameters[6], Parameters[7]);
			request.setAttribute("order", order);
		}
		else
			page="/view/CardNumError.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		   dispatcher.forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public boolean CheckCardNum(String ccn, String rccn){
		if((ccn != "" && rccn != "")&& ccn.equals(rccn))
			return true;
		else
			return false;
	}

}
