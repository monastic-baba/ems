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
                    <td><label>Urgency:</label></td>
                    <td><form:select path="urgency">
                            <form:option value="Low" label="Low"/>
                            <form:option value="Medium" label="Medium"/>
                            <form:option value="High" label="High"/>
                            </form:select> </td>

                </tr>


                <tr>
                    <td><label>Start Date:</label></td>
                    <td><form:input type="date" path="startDate" /></td>
                </tr>

                <tr>
                    <td><label>End Date:</label></td>
                    <td><form:input type="date" path="endDate" /></td>
                </tr>

                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Request" class="save" /></td>
                </tr>

            </tbody>
        </table>

    </form:form>


</html>