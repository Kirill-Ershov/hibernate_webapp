<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<body>

<h2>DevEmployee Info</h2>
<br>
    <form:form action="saveEmployee" modelAttribute="employee">

        <form:hidden path="id"/>

        Name <form:input path="name"/> <form:errors path="name"/>
        <br><br>
        Surname <form:input path="surname"/> <form:errors path="surname"/>
        <br><br>
        Grade <form:select path="grade">
            <form:option value="Senior"/>
            <form:option value="Middle"/>
            <form:option value="Junior"/>
            <form:option value="Trainee"/>
        </form:select>
        <br><br>
        PL <form:select path="pl">
        <form:option value="Java"/>
        <form:option value="JavaScript"/>
        <form:option value="C#"/>
        <form:option value="C++"/>
        <form:option value="Python"/>
        <form:option value="Ruby"/>
        <form:option value="Other"/>
    </form:select>
        <br><br>
        Salary <form:input path="salary"/> <form:errors path="salary"/>
        <br><br>
        Location ID <form:input path="location"/>
        <br><br>
        Phone number <form:input path="phoneNumber"/> <form:errors path="phoneNumber"/>
        <br><br>
        <input type="submit" value="OK">
        <input type="button" value="Cancel" onclick="window.location.href = 'employees'">


    </form:form>

</body>

</html>