<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Student Details</h3>
        <form method="POST" action="/saveStudent" >
             <table>
                <tr>
                    <td><label for="name">Name</label></td>
                    <td><input type="text" name="name"></td>
                </tr>
                
                <tr>

                <tr>
                    <td><label for="contactNo">
                      Contact Number</label></td>
                    <td><input name="contactNo"></td>
                </tr>

                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>