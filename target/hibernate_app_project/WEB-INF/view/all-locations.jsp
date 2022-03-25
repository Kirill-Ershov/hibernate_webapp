
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h2> All Locations </h2>
<br>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Code</th>
    </tr>

    <c:forEach var="loc" items="${allLocs}">

        <c:url var="updateButton" value="/updateLocInfo">
            <c:param name="locId" value="${loc.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteLocation">
            <c:param name="locId" value="${loc.id}"/>
        </c:url>

        <tr>
            <td>${loc.id}</td>
            <td>${loc.name}</td>
            <td>${loc.code}</td>
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
       onclick="window.location.href = 'addNewLocation'"/>
<input type="button" value="Back"
       onclick="window.location.href = 'startpage'"/>

</body>


</html>