
package customerservlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Serializable;

public class GetData implements Serializable{
	
	private static final long serialVersionUID = 1L;
    private String name;
    private String ssn;
    private String zipcode;
    private String emailid;
    private String address;
    private String city;
    private String state;
    private int mobile;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getssn() {
        return ssn;
    }
    public void setssn(String ssn) {
        this.ssn = ssn;
    }
    public String getzipcode() {
        return zipcode;
    }
    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public int getmobile () {
    	return mobile;
    }
    public void setmobile(int mobile) {
    	this.mobile=mobile;
    }
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
    }
    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
    }
    public String getstate() {
        return state;
    }
    public void setstate(String state) {
        this.state = state;
    }
    public boolean validateEmail(){
		final String EMAIL_PATTERN =
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pat = Pattern.compile(EMAIL_PATTERN);
		if (address == null || address.length() < 7)
            return false;
        return pat.matcher(address).matches();
	}
	
	public boolean validateZip(){
		String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(zipcode).matches();
		
	}
   
}
