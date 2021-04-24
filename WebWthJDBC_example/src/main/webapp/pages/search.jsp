<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Search using ID of the student</h3>

        <form method="POST" action="/searchStudent" >
            <table>
               <tr>
                   <td><label for="id">ID</label></td>
                   <td><input type="text" name="id"></td>
               </tr>
               <tr>
                   <td><input type="submit" value="Submit"></td>
               </tr>
           </table>
       </form>

        <form name="StudentSearched" >
             <table>
                <td><label for="name">${obj.name}</label></td>
                <td><label for="id">${obj.id}</label></td>                    
                <td><label for="contactNo">${obj.contactNo}</label></td>                    
            </table>
        </form>
    </body>
</html>