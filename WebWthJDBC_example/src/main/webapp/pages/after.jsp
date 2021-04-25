<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Your data is saved as</h3>
        <form name="afterSave" >
             <table>
                <td><label for="name">${obj.name}</label></td>                    
                <td><label for="contactNo">${obj.contactNo}</label></td> 
                <td> With ID </td>                   
                <td><label for="id">${obj.id}</label></td>
            </table>
        </form>
    </body>
</html>