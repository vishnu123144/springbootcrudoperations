<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add the product</title>
</head>
<body>
  
  <h2>Create the form to add the product</h2>
  <form action="addProduct" method="post">
  product name <input type="text" name="productName">
  product description<input type="text" name="productDesc">
  price <input type="text" name="price">
  <input type="submit" value="Add the product">
  
  </form>

</body>
</html>