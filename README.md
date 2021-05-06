**A Simple Example showcasing Spring MVC.**

It includes:
<li>Simple form binding
<li>Form binding with a collection of objects
    <ul>
        <li>The {{varStatus="tagStatus"}} of {{ < c:forEach > }}       
        is used for maintaining the index positions of the objects in a given list. And can be accessed as given below:
        
        <c:forEach items="${Users.users}" var="user" varStatus="tagStatus">
           <tr>
              <td><form:input path="users[${tagStatus.index}].firstName" value="${user.firstName}"/></td>
              <td><form:input path="users[${tagStatus.index}].lastName" value="${user.lastName}"/></td>
              <td><form:input path="users[${tagStatus.index}].email" value="${user.email}"/></td>
           </tr>
        </c:forEach>
        
