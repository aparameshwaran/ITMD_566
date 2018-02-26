<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Information</title>
</head>
<body>
<form >
		<table align="center" bgcolor="#99FFCC" border="1" width="70%">
			<tr>
				<td colspan="2" align="center">Customer Details</td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="name" size="12" pattern=".{4,50}" title="Customer Name should be in limit of 4 to 50 characters"/><br>></td>
			</tr>
			<tr>
				<td>Customer Social Security Number</td>
				<td><input type="text" name="ssn" size="12" pattern="\d{3}-?\d{2}-?\d{4}" title="###-##-####"/></td>
			</tr>
			<tr>
				<td>Zip Code</td>
				<td><input type="text" name="zipcode" maxlength="15"></td>
			</tr>
			<tr>
				<td>Customer Email Address</td>
				<td><input type="text" name="emailid" maxlength="50"></td>
			</tr>
			<tr>
				<td>Street Address</td>
				<td><input type="text" name="address" size="50" pattern=".{4,50}" title="Street address should be in limit of 4 to 50 characters"/></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"size="50"  pattern=".{3,50}" title="City name should be in limit of 3 to 50 characters"/></td>
			</tr>
			<tr>
				<td>State</td>
				<td>
				<select>
				<option selected="" value="Default">(Please select a State)</option>
				  <option value="NY">NY</option>
				  <option value="CA">CA</option>
				  <option value="MA">MA</option>
				  <option value="IL">IL</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" 
					value="Submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>