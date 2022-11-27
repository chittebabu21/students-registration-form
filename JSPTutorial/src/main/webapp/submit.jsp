<%@ page import = "java.util.*"%>
<%@ page import = "java.sql.*"%>
<%@ page import = "com.sa.models.StudentsInfo"%>
<%@ page import = "com.sa.dao.StudentsInfoDao"%>
<%
String firstName = request.getParameter("first-name");
String lastName = request.getParameter("last-name");
String gender = request.getParameter("gender");
String address = request.getParameter("address");
String phoneNumber = request.getParameter("phone-number");
String course = request.getParameter("course");

StudentsInfoDao dao = new StudentsInfoDao();
StudentsInfo student = new StudentsInfo();

try {
    student.setFirstName(firstName);
    student.setLastName(lastName);
    student.setGender(gender);
    student.setAddress(address);
    student.setPhoneNumber(phoneNumber);
    student.setCourseSelected(course);

    int rows = dao.insert(student);
    // out.println("Rows affected: " + rows);
} catch (Exception e) {
    e.printStackTrace();
}
%>

<h2>Successfully Registered!</h2>
<br>
<form action="index.html" method="post">
    <button style="letter-spacing: 0.5em; width: 10%; padding: 1em; border-radius: 10px; background-color: blue; color: white; cursor: pointer;" type="submit">Back</button>
</form>