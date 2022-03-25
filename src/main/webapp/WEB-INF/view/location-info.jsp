<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<body>

<h2>Location Info</h2>
<br>
    <form:form action="saveLocation" modelAttribute="location">

        <form:hidden path="id"/>

        Name <form:input path="name"/> <form:errors path="name"/>
        <br>
        Code <form:input path="code"/> <form:errors path="code"/>
        <br>

        <input type="submit" value="OK">
        <input type="button" value="Cancel" onclick="window.location.href = 'locations'">


    </form:form>

</body>

</html>