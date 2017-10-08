<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
     <%-- JSP Expression Language --%>
       <center>
     <h2> Reading All Request Parameter</h2>
     <table border="1">
     <tr>
     <th>Parameter Name</th><th>Parameter Value(s)</th>
     </tr>
     <tr>
     <td>cardNum</td>   <td>${order.cardNum}</td>
     </tr>
     <tr>
     <td>cardType</td>  <td>${order.cardType}</td>
     </tr>
     <tr>
     <td>price</td>  <td>${order.price}</td>
     </tr>
     <tr>
     <td>initial</td>  <td>${order.initial}</td>
     </tr>
     <tr>
     <td>itemNum</td>  <td>${order.itemNum}</td> 
     </tr>
     <tr>
     <td>address</td>  <td>${order.address}</td>
     </tr>
     <tr>
     <td>firstName</td>  <td>${order.firstName}</td>
     </tr>
     <tr>
     <td>description</td>  <td>${order.description}</td>
     </tr>
     <tr>
     <td>lastName</td>  <td>${order.lastName}</td>
     </tr>
     </table>
  </center>
</body>
</html>
