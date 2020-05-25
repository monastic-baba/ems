<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
</head>
<body>
    <h2> Hello again !!!!!</h2>

    <p> Request a Machine </p>
    <input type="button" value="New Request"
    				   onclick="window.location.href='user/newRequest'; return false;"
    				   class="add-button"
    			/>

    <p> View Available Machines </p>
    <input type="button" value="View Available"
        				   onclick="window.location.href='user/availableMachines'; return false;"
        				   class="add-button"
        			/>

     <br> </br>

     <p> Logout </p>
         <input type="button" value="LOGOUT"
             				   onclick="window.location.href='logout'; return false;"
             				   class="add-button"
             			/>
</body>
</html>