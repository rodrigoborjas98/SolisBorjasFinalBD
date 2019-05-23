<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" action="#" modelAttribute="addstudentpost">
             <table>
                <tr>
                   <td><form:label path="name">Name</form:label></td>
                   <td><form:input path="name"/></td>
                </tr>
                <tr>
                   
                </tr>
                <tr>
                
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>