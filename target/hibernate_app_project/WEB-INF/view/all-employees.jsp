
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h2> All DevEmployees </h2>
<br>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Grade</th>
        <th>PL</th>
        <th>Salary</th>
        <th>Location</th>
        <th>Phone Number</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">

        <c:url var="updateButton" value="/updateEmpInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.grade}</td>
            <td>${emp.pl}</td>
            <td>${emp.salary}</td>
            <td>${emp.location}</td>
            <td>${emp.phoneNumber}</td>
            <td>
                <input type="button" value="Update"
                       onclick = "window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick = "window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add new one"
       onclick="window.location.href = 'addNewEmployee'"/>
<input type="button" value="Back"
       onclick="window.location.href = 'startpage'"/>

</body>


</html>