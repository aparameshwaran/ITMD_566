<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="WebServiceConsumer.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <link href="bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="form1" runat="server">
        <div class="form-group">

            <label for="exampleInputEmail1">Customer Location</label>
            <asp:TextBox class="form-control" ID="TextBox1" runat="server" placeholder="City"></asp:TextBox>

            <asp:Button ID="Button1" runat="server" Text="Button" OnClick="Button1_Click" class="btn btn-default" />
            <br />
        </div>
        <div class="form-group">
            <asp:Label ID="Details" runat="server" Text=""></asp:Label>
        </div>

        <div class="form-group">
        <label for="exampleInputEmail1">Location List</label>
        <asp:TextBox class="form-control" ID="TextBox2" runat="server" placeholder="City"></asp:TextBox>
            <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Button" class="btn btn-default"/>
        <br />
		</div>
		
		<div class="form-group">
            <asp:Label ID="Label1" runat="server" Text=""></asp:Label>
        </div>

		<div class="form-group">
            <label for="exampleInputEmail1">Employee List</label>
        <asp:TextBox class="form-control" ID="TextBox3" runat="server" placeholder="City"></asp:TextBox>

            <asp:Button ID="Button3" runat="server" OnClick="Button3_Click" Text="Button" class="btn btn-default"/>
        <br />
		</div>
        <div class="form-group">
            <asp:Label ID="Label2" runat="server" Text=""></asp:Label>
        </div>
		
		<div class="form-group">
            <label for="exampleInputEmail1">Expense List</label>
        <asp:TextBox class="form-control" ID="TextBox5" runat="server" placeholder="Expense Category"></asp:TextBox>
            
            <asp:Button ID="Button5" runat="server" OnClick="Button5_Click" Text="Button" class="btn btn-default"/>
            
        <br />
    </div>
        <div class="form-group">
            <asp:Label ID="Label4" runat="server" Text=""></asp:Label>
        </div>

		<div class="form-group">
            <label for="exampleInputEmail1">Price List</label>
        <asp:TextBox class="form-control" ID="TextBox6" runat="server" placeholder="Price ID"></asp:TextBox>
            
            <asp:Button ID="Button6" runat="server" OnClick="Button6_Click" Text="Button" class="btn btn-default"/>
            
        <br />
    </div>
        <div class="form-group">
            <asp:Label ID="Label5" runat="server" Text=""></asp:Label>
        </div>
		
		
		<div class="form-group">
            <label for="exampleInputEmail1">Truck List</label>
        <asp:TextBox class="form-control" ID="TextBox7" runat="server" placeholder="Employee ID"></asp:TextBox>
            
            <asp:Button ID="Button7" runat="server" OnClick="Button7_Click" Text="Button" class="btn btn-default"/>
            
        <br />
    </div>
        <div class="form-group">
            <asp:Label ID="Label6" runat="server" Text=""></asp:Label>
        </div>
		
		<div class="form-group">
            <label for="exampleInputEmail1">Item List</label>
        <asp:TextBox class="form-control" ID="TextBox8" runat="server" placeholder="Item ID"></asp:TextBox>
            
            <asp:Button ID="Button8" runat="server" OnClick="Button8_Click" Text="Button" class="btn btn-default"/>
            
        <br />
    </div>
        <div class="form-group">
            <asp:Label ID="Label7" runat="server" Text=""></asp:Label>
        </div>
		
		
		<div class="form-group">
            <label for="exampleInputEmail1">Transaction List</label>
        <asp:TextBox class="form-control" ID="TextBox9" runat="server" placeholder="order"></asp:TextBox>
            
            <asp:Button ID="Button9" runat="server" OnClick="Button9_Click" Text="Button" class="btn btn-default" />
            
        <br />
    </div>
        <div class="form-group">
            <asp:Label ID="Label8" runat="server" Text=""></asp:Label>
        </div>
		
    </form>

</body>
</html>
