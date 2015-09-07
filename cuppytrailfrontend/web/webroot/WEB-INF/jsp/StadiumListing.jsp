<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stadium Listing</title>
</head>
<body>
	<h1>Stadium Listing</h1>
	<ul>
		<c:forEach var = "stadium" items="${stadiums}">
			<li><a href="./stadiums/${stadium.name}">${stadium.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>