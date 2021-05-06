<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC List of objects</title>
</head>
<body>
<form:form  method="post" action="/saveUsers" modelAttribute="Users">
    <table>
        <tr>
            <th>First Name</th><th>Last Name</th><th>Email</th>
        </tr>
        <c:forEach items="${Users.users}" var="user" varStatus="tagStatus">
            <tr>
                <td><form:input path="users[${tagStatus.index}].firstName" value="${user.firstName}"/></td>
                <td><form:input path="users[${tagStatus.index}].lastName" value="${user.lastName}"/></td>
                <td><form:input path="users[${tagStatus.index}].email" value="${user.email}"/></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
