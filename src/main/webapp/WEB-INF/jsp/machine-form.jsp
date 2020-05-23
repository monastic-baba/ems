<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <title>Machine!</title>
</head>


<body>
    <h3> New Machine Form !!!!!</h3>
</body>

    <form:form action="saveMachine" modelAttribute="machine" method="POST">

        <table>
            <tbody>
                <tr>
                    <td><label>Name:</label></td>
                    <td><form:input path="name" /></td>
                </tr>

                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Save" class="save" /></td>
                </tr>

            </tbody>
        </table>

    </form:form>


    <h3> Delete Engineer using EngineerID </h3>

     <form:form action="deleteMachine" modelAttribute="machine" method="POST">

                 <table>
                     <tbody>
                         <tr>
                             <td><label>Machine Id:</label></td>
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