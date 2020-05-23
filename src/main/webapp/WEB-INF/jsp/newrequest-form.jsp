<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <title>Request!</title>
</head>


<body>
    <h3> New Request Form !!!!!</h3>
</body>

    <form:form action="createRequest" modelAttribute="request" method="POST">

        <table>
            <tbody>
                <tr>
                    <td><label>Machine ID:</label></td>
                    <td><form:input path="machineId" /></td>
                </tr>

                <tr>
                    <td><label>Engineer ID:</label></td>
                    <td><form:input path="engineerId" /></td>
                </tr>

                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Request" class="save" /></td>
                </tr>

            </tbody>
        </table>

    </form:form>


</html>