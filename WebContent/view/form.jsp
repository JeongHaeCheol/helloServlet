<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <center><h2><b>A Sample Form</b></h2></center>
  
  <form action="/HomeWork1/OrderControl" method="get">
  Item Number:
  <input type="text" name="in"><br>
  Description:
  <input type="text" name="dc"><br>
  Price Each:
  <input type="text" name="pe"><br>
  <hr>
  First Name:
  <input type="text" name="fn"><br>
  Last Name:
  <input type="text" name="ln"><br>
  Middle Initial:
  <input type="text" name="mi"><br>
  Shipping Address: <textarea name="sa" cols="25" rows="3"></textarea>
  <br>
  Credit Card:<br>
  <input type="radio" name="CardType" value="Visa">Visa<br>
  <input type="radio" name="CardType" value="MasterCard">MasterCard<br>
  <input type="radio" name="CardType" value="American Express">American Express<br>
  <input type="radio" name="CardType" value="Discover">Discover<br>
  <input type="radio" name="CardType" value="Java SmartCard">Java SmartCard<br>
  
  Credit Card Number: 
  <input type="password" name="ccn" value="0000"><br>
  Repeat Credit Card Number:
  <input type="password" name="rccn" value="0000"><br>
  <input type="submit" value="Submit Order">
  
  </form>
</body>
</html>