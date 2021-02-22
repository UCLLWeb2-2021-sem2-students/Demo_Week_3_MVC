<!DOCTYPE html>
<html>
<head>
	<title>Guess</title>
	<link rel="stylesheet" href="css/sample.css" type="text/css">
</head>
<body>
	<h1>Thinking a number</h1>
	<p>You guessed <%= request.getParameter("guess")%>...</p>
	<h2><%= request.getAttribute("result") %></h2>
	<img src="images/guess.jpg" alt="">

</body>
</html>