using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WebServiceConsumer.CustomerListService;
using WebServiceConsumer.LocationListService;

namespace WebServiceConsumer
{
    public partial class Default : System.Web.UI.Page
    {
        //TrucksServiceReference.ServiceProviderClient proxy;
        CustomerListService.CustomerListClient proxy;
		LocationListService.LocationListClient proxy1;
		EmployeeListService.EmployeeListClient proxy2;
		CommentListService.CommentListClient proxy3;
		ExpenseListService.ExpenseListClient proxy4;
		PriceListService.PriceListClient proxy5;
		TrucksList.TrucksListServiceClient proxy6;
		ItemListService.ItemListClient proxy7;
		TransactionListService.TransactionListClient proxy8;

        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {


            proxy = new CustomerListService.CustomerListClient("CustomerListPort");

            CustomerListService.customer[] cusRes = proxy.listCustomers(TextBox1.Text);
            try
            {

                for (int i = 0; i < cusRes.Length; i++)
                {

                    //TableRow tRow = new TableRow();
                    //Table1.Rows.Add(tRow);

                    Details.Text = Details.Text + "<br/>CustomerID: " + cusRes[i].customerID;
                    Details.Text = Details.Text + "<br/>CompanyName: " + cusRes[i].companyName;
                    Details.Text = Details.Text + "<br/>EmailAddress: " + cusRes[i].emailAddress;
                    Details.Text = Details.Text + "<br/>ContactName: " + cusRes[i].contactName;
                    Details.Text = Details.Text + "<br/>";
                }

            }
            catch (FormatException)
            {
                //Label1.Text = "Result: Invalide Input";
            }
        }
		
		protected void Button2_Click(object sender, EventArgs e)
        {
			proxy1 = new LocationListService.LocationListClient("LocationListPort");
            LocationListService.location[] empRes = proxy1.listLocations(TextBox2.Text);
            

            for (int i = 0; i < empRes.Length; i++)
            {
                Label1.Text = Label1.Text + "<br/>Customer ID: " + empRes[i].customerID;
                Label1.Text = Label1.Text + "<br/>Location ID: " + empRes[i].locationID;
                Label1.Text = Label1.Text + "<br/>Location Code: " + empRes[i].locationCode;
                Label1.Text = Label1.Text + "<br/>State: " + empRes[i].state;
                Label1.Text = Label1.Text + "<br/>";
                

            }
        }

		protected void Button3_Click(object sender, EventArgs e)
        {
            proxy2 = new EmployeeListService.EmployeeListClient("EmployeeListPort");
            EmployeeListService.employee[] empRes = proxy2.EXT(TextBox3.Text);

            for (int i = 0; i < empRes.Length; i++)
            {
                Label2.Text = Label2.Text + "<br/>Employee ID: " + empRes[i].employeeID;
                Label2.Text = Label2.Text + "<br/>First Name: " + empRes[i].firstName;
                Label2.Text = Label2.Text + "<br/>Last Name: " + empRes[i].lastName;
                Label2.Text = Label2.Text + "<br/>Email Address: " + empRes[i].emailAddress;
                Label2.Text = Label2.Text + "<br/>Phone Number: " + empRes[i].cellPhone;
                Label2.Text = Label2.Text + "<br/>";
            }
        }
		
		protected void Button5_Click(object sender, EventArgs e)
        {
            proxy4 = new ExpenseListService.ExpenseListClient("ExpenseListPort");
            ExpenseListService.expense[] empRes = proxy4.paymentMethod(TextBox5.Text);

            for (int i = 0; i < empRes.Length; i++)
            {
                Label4.Text = Label4.Text + "<br/>Expense ID: " + empRes[i].expenseID;
                Label4.Text = Label4.Text + "<br/>Employee ID: " + empRes[i].employeeID;
                Label4.Text = Label4.Text + "<br/>Truck ID: " + empRes[i].truckID;
                Label4.Text = Label4.Text + "<br/>:Amount " + empRes[i].amount;
                //Label2.Text = Label2.Text + "<br/>Phone Number: " + empRes[i].cellPhone;
                Label4.Text = Label4.Text + "<br/>";
            }
        }
		
		protected void Button6_Click(object sender, EventArgs e)
        {
            proxy5 = new PriceListService.PriceListClient("PriceListPort");
            PriceListService.price[] empRes = proxy5.listPrices(TextBox6.Text);

            for (int i = 0; i < empRes.Length; i++)
            {
                Label5.Text = Label5.Text + "<br/>Location ID: " + empRes[i].locationID;
                Label5.Text = Label5.Text + "<br/>Price: " + empRes[i].price1;
                //Label2.Text = Label4.Text + "<br/>Truck ID: " + empRes[i].truckID;
                //Label2.Text = Label4.Text + "<br/>:Amount " + empRes[i].amount;
                //Label2.Text = Label2.Text + "<br/>Phone Number: " + empRes[i].cellPhone;
                Label5.Text = Label5.Text + "<br/>";
            }
        }
		
		protected void Button7_Click(object sender, EventArgs e)
        {
            proxy6 = new TrucksList.TrucksListServiceClient("TrucksListServicePort");
            TrucksList.truck[] empRes = proxy6.listTrucks(TextBox7.Text);

            for (int i = 0; i < empRes.Length; i++)
            {
                Label6.Text = Label6.Text + "<br/>Truck ID: " + empRes[i].truckID;
                Label6.Text = Label6.Text + "<br/>VIN: " + empRes[i].VIN;
                Label6.Text = Label6.Text + "<br/>Make: " + empRes[i].makeYear;
                Label6.Text = Label6.Text + "<br/>Model: " + empRes[i].model;
                Label6.Text = Label6.Text + "<br/>";
            }
        }
		
		
		protected void Button8_Click(object sender, EventArgs e)
        {
            proxy7 = new ItemListService.ItemListClient("ItemListPort");
            ItemListService.item[] empRes = proxy7.ItemID(TextBox8.Text);

            for (int i = 0; i < empRes.Length; i++)
            {
                Label7.Text = Label7.Text + "<br/>Item ID: " + empRes[i].itemID;
                Label7.Text = Label7.Text + "<br/>Item Descroption: " + empRes[i].itemDescription;
                Label7.Text = Label7.Text + "<br/>Item Name: " + empRes[i].itemName;
                Label7.Text = Label7.Text + "<br/>Price: " + empRes[i].price;
                Label7.Text = Label7.Text + "<br/>Quantity: " + empRes[i].quantity;
                Label7.Text = Label7.Text + "<br/>";
            }
        }
		
		protected void Button9_Click(object sender, EventArgs e)
        {
            proxy8 = new TransactionListService.TransactionListClient("TransactionListPort");
            TransactionListService.transaction[] empRes = proxy8.listTransactions(TextBox9.Text);

            for (int i = 0; i < empRes.Length; i++)
            {
                Label8.Text = Label8.Text + "<br/>Unit Price: " + empRes[i].unitPrice;
                Label8.Text = Label8.Text + "<br/>Discount: " + empRes[i].discount;
                Label8.Text = Label8.Text + "<br/>Quantity: " + empRes[i].quantity;
                Label8.Text = Label8.Text + "<br/>Trans Amt: " + empRes[i].transactionAmount;
                Label8.Text = Label8.Text + "<br/>Trans Desc: " + empRes[i].transactionDescription;
                Label8.Text = Label8.Text + "<br/>Trans Date: " + empRes[i].transactionDate;
                Label8.Text = Label8.Text + "<br/>";
            }
        }
		
    }
     
}