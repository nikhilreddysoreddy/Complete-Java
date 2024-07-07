<%@page language="java" %>

<html lang="en">
<head>
<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Number Input Form</title>
</head>
<body>
    
<h2>Enter Two Numbers</h2>
<form action="addAlien" method="get">
    <table>
        <tr>
            <td><label for="aid">Enter aid :</label></td>
            <td><input type="text" id="aid" name="aid" required></td>
        </tr>
        <tr>
            <td><label for="aname">Enter name :</label></td>
            <td><input type="text" id="aname" name="aname" required></td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Submit</button></td>
        </tr>
    </table>
</form>

</body>
</html>
