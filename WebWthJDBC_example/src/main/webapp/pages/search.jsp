<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Search / Update using ID of the student</h3>

        <form method="POST" action="/searchStudent" >
            <table>
               <tr>
                   <td><label for="id">ID</label></td>
                   <td><input type="text" name="id"></td>
               </tr>
               <tr>
                   <td><input type="submit" value="submit"></td>
               </tr>
           </table>
       </form>

        <form name="/updateStudent" >
             <table>
                <td><input type="text" value=${obj.indgName}></td>                   
                <td><input type="text" value=${obj.stream}></td>
                <td><input type="text" value=${obj.contactNo}></td>
                <tr>
                    <td><input type="submit" value="submit"></td>
                </tr>                    
            </table>
        </form>
    </body>
</html>