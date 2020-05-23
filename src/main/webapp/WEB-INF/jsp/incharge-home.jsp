<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
</head>
<body>
    <h2> Hello again !!!!!</h2>

    <p> Engineer Actions </p>
    <input type="button" value="Add or Delete Engineer"
    				   onclick="window.location.href='admin/addOrDeleteEngineer'; return false;"
    				   class="add-button"
    			/>

    <p> Machine Actions </p>
    <input type="button" value="Add or Delete Machine"
        				   onclick="window.location.href='admin/addOrDeleteMachine'; return false;"
        				   class="add-button"
        			/>
</body>
</html>