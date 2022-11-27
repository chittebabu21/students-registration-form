<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Delete Student Data</title>
    <style>
        table, th, td {
            border: 1px inset blue;
            padding: .5em;
        }
     </style>
</head>

<%@ page import = "java.util.*"%>
<%@ page import = "java.sql.*"%>
<%@ page import = "com.sa.dao.StudentsInfoDao"%>
<%@ page import = "com.sa.models.StudentsInfo"%>

<h2>Student Data</h2>
<%
Connection connect = StudentsInfoDao.getDBConnection();
Statement stmt = connect.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM Students;");
%>

<div>
    <table>
        <th>
            <tr>
                <td>Student Id</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Gender</td>
                <td>Address</td>
                <td>Phone Number</td>
                <td>Course Selected</td>
            </tr>
        </th>
        <tb>
            <% int i = 0; while (rs.next()) {%>
            <tr>
                <td><%= rs.getInt(1)%></td>
                <td name="first-name"><%= rs.getString(2)%></td>
                <td name="last-text"><%= rs.getString(3)%></td>
                <td name="gender"><%= rs.getString(4)%></td>
                <td name="address"><%= rs.getString(5)%></td>
                <td name="phone-number"><%= rs.getString(6)%></td>
                <td name="course"><%= rs.getString(7)%></td>
                <%}%>
            </tr>
        </tb>
    </table>
</div>
<br>
<form action="index.html">
    <button style="letter-spacing: 0.5em; width: 10%; padding: 0.8em; border-radius: 10px; background-color: blue; color: white; cursor: pointer; margin-top: 1em;" type="submit">Back</button>
</form>