<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear employee please select your name</h2>
<br>
<br>
<br>

<form:form action="getempl" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surnname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department<form:select path="depaertmet">
    <form:options items="${employee.depaertmets}"/>
    </form:select>
    <br><br>
    Number<form:input path="phoneNuber"/>
    <form:errors path="phoneNuber"/>
    <br><br>
    Email<form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <input type="submit" value="Ok">
    </form:form>


</body>


</html>