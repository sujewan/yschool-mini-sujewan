<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Registration</title>
    
    <script>
        function validateForm()
        {
            if (document.form1.txtSName.value=="")
            {
                alert("Enter the Student Name");
                document.form1.txtSName.focus();
                return false;
            }
            else if (document.form1.txtAddress.value=="")
            {
                alert("Enter the Address");
                document.form1.txtAddress.focus();
                return false;
            }
            else if (document.form1.txtPName.value=="")
            {
                alert("Enter the Parent Name");
                document.form1.txtPName.focus();
                return false;
            }
        }
    </script>
    
</head>

<body>
    
    <div align="center">
        <h1>Student Registration</h1>
    </div>
    
<form id="form1" name="form1" method="post" action="SerRegistration" onsubmit="return validateForm()">
  <table width="290" border="0" align="center">
    <tr>
      <td>Student Name</td>
      <td>
          <input type="text" name="txtSName" id="txtSName" />
      </td>
    </tr>
    <tr>
      <td>Address</td>
      <td>
          <textarea name="txtAddress" id ="txtAddress"></textarea>
      </td>
    </tr>
    <tr>
      <td>Grade</td>
      <td>
          <select name="cbGrade" id="cbGrade" >
              <option>01</option>
              <option>02</option>
              <option>03</option>
              <option>04</option>
              <option>05</option>
              <option>06</option>
              <option>07</option>
              <option>08</option>
              <option>09</option>
              <option>10</option>
              <option>11</option>
              <option>12</option>
              <option>12</option>
          </select>
      </td>
    </tr>
    <tr>
      <td>Parent Name</td>
      <td>
          <input type="text" name="txtPName" id="txtPName" />
      </td>
    </tr>
    <tr>
        <td></td>
        <td>
          <input type="submit" name="btnReg" id="btnReg" value="Register">
          <input type="reset" name="btnReset" id="btnReset" value="Reset">
        </td>
    </tr>
  </table>
</form>
</body>

</html>
