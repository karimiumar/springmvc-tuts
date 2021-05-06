<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC tutorial - Home JSP</title>
</head>
<body>
    <h4>Message-</h4><span>${message}</span>
    <form:form action="showUser" modelAttribute="user" method="post">
        <tr>
            <td>
                <form:label path="firstName">First Name</form:label>
            </td>
            <td>
                <form:input path="firstName" id="firstName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="lastName">Last Name</form:label>
            </td>
            <td>
                <form:input path="lastName" id="lastName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="email">Email</form:label>
            </td>
            <td>
                <form:input path="email" id="email"/>
            </td>
        </tr>
        <input type="submit" value="Submit">
    </form:form>
    <div id="showUsers">
        <a href="/getUsers">Show Users</a>
    </div>
</body>
</html>
