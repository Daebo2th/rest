<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="/board/getBoardList.do">리스트 보기</a>
<a href="/getText">getText</a>
<a href="/getList">getList</a>
<a href="/getObject">getObject</a>
<a href="/getPath/qwe/20">getPath</a>
</body>
</html>
