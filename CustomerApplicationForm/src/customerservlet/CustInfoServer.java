/**
 * 
 */
package customerservlet;

/**
 * @author ajayp
 *
 */

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//import com.google.maps.GeoApiContext;
//import com.google.maps.GeocodingApi;
//import com.google.maps.model.GeocodingResult;


/**
 * Servlet implementation class InsertCustomerServlet
 */
@WebServlet("/CustInfoServer")


public class CustInfoServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String API_Key="AIzaSyBaUlpgU6hB_dU0rxr6Yi-s8IaSfdILKPI";
	//GeocodingResult[] results;
	GetData customer = new GetData();
	/*
	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();   
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	 //@NotNull(message = "Customer Name cannot be null")
	 //@Size(min = 4, max = 50, message = "Customer Name must be between 4 and 50 characters")
	   // private String name;
	 
	  //@NotNull(message="Social Security cannot be blank")
	  //@Size(min=11,max=11,message="SSN cannot be less than 11 digits or more than 11 digits")
	  //private String ssn;
	  
	    //@NotNull(message="ZipCode cannot be blank")
	    //@Pattern(regexp="(^\\d{5}$)|(^\\d{5}-\\d{4}$)",message="Zip Code must be a valid one")
	    //private int zipcode;
	    
	    //@NotNull(message = "Street Address cannot be null")
		 //@Size(min = 4, max = 50, message = "Street Address must be between 4 and 50 characters")
		   // private String address;
	    
	    //@NotNull(message = "City field cannot be null")
		 //@Size(min = 3, max = 50, message = "City must be between 4 and 50 characters")
		   // private String City;
	    
	    //@NotNull(message = "Email Cannot be null")
	    //@Pattern(regexp="^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$", 
	    //message="Email should be valid")
	    
	   // private String email;
	    //public CustInfoServer() {
        //super();
        // TODO 	Auto-generated constructor stub
    //}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
//		GeoApiContext context = new GeoApiContext().setApiKey(API_Key);
//		try {
//			results = GeocodingApi.geocode(
//					context,
//					request.getParameter("streetaddr")+" "+request.getParameter("city")+", "+request.getParameter("state")+ " "+request.getParameter("zip")).await();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(results[0].geometry.location.lat);
//		session.setAttribute("latitude", results[0].geometry.location.lat);
//		session.setAttribute("longitude", results[0].geometry.location.lng);
	
	
		request.getRequestDispatcher("/ProcessCustomerDataRequest.jsp").forward(request, response);
		
		
		       }
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("----- InsertCustomerServlet -----");
        try {
        // Get the customer value submitted from Customer.jsp page through HttpServletRequest object
            String name=request.getParameter("name");
            String address=request.getParameter("address");
            String mobile=request.getParameter("mobile");
            String emailid=request.getParameter("emailid");
             
            //Set the Customer values into Customer Bean 
            GetData customer=new GetData();
            customer.setName(name);
            customer.getaddress();
            customer.setmobile(Integer.parseInt(mobile));
            customer.setEmailid(emailid);
             
            RequestDispatcher dispatcher=request.getRequestDispatcher("/ProcessCustomerDataRequest.jsp");
            //Set the customer instance into request.Then only the customer object 
            //will be available in the Welcome.jsp page
            request.setAttribute("cust",customer);
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        boolean message = false;
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		customer.setzipcode(request.getParameter("yourZip"));
		customer.setEmailid(request.getParameter("yourEmail"));
		session.setAttribute("Name", request.getParameter("yourName"));
		session.setAttribute("Ssn", request.getParameter("yourSSN"));
		session.setAttribute("Zip", request.getParameter("yourZip"));
		session.setAttribute("Email", request.getParameter("yourEmail"));
		session.setAttribute("Address", request.getParameter("yourAddress"));
		session.setAttribute("City", request.getParameter("yourCity"));
		session.setAttribute("State", request.getParameter("yourState"));
		response.setContentType("text/html");
		
		doGet(request, response);
	//	GeoApiContext context = new GeoApiContext().setApiKey(API_Key);
		//Set<ConstraintViolation<GetData>> violations = validator.validate(customer);
		//for (ConstraintViolation<GetData> violation : violations) {
		    //System.out.println(violation.getMessage()); 
		    //request.setAttribute("message", violation.getMessage());
		   //message=true;
		//}
         
    }
 
	}

