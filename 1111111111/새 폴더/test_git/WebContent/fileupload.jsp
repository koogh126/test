<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./FileUploadServlet" method="post" enctype="multipart/form-data">
전송하는 사람 : <input type="text" name="name" value="사람"><br>
전송하는 파일 : <input type="file" name="uploadfile"><br>
<input type="submit" value="전송"/>

</form>
</body>
</html>