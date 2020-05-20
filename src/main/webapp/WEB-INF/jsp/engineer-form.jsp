<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <title>Engineer!</title>
</head>


<body>
    <h3> New Engineer Form !!!!!</h3>
</body>

    <form:form action="saveEngineer" modelAttribute="engineer" method="POST">

        <table>
            <tbody>
                <tr>
                    <td><label>First Name:</label></td>
                    <td><form:input path="firstName" /></td>
                </tr>

                <tr>
                    <td><label>Last Name:</label></td>
                    <td><form:input path="lastName" /></td>
                </tr>

                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Save" class="save" /></td>
                </tr>

            </tbody>
        </table>

    </form:form>


    <h5> Delete Engineer using EngineerID </h5>

     <form:form action="deleteEngineer" modelAttribute="engineer" method="POST">

                 <table>
                     <tbody>
                         <tr>
                             <td><label>Engineer Id:</label></td>
                             <td><form:input path="id" /></td>
                         </tr>

                         <tr>
                             <td><label></label></td>
                             <td><input type="submit" value="Delete" /></td>
                         </tr>

                     </tbody>
                 </table>

     </form:form>

</html>