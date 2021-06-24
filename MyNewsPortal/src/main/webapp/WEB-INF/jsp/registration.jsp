<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Registration</title>
</head>
<body>
            <form action="Controller" method="post">
                <fieldset>
                    <legend>Registration</legend>
                    <input type="hidden" name="command" value="forward" />
                    <input type="text" name="Second Name" maxlength="25" value="" pattern="[а-яА-Я]+$" required autofocus placeholder="Second Name">
                    <br><br>
                    <input type="text" name="First Name" maxlength="20" value="" pattern="[а-яА-Я]+$" required placeholder="First Name">
                    <br><br>
                    <input type="text" name="login" value="">* Login
                    <br><br>
                    <input type="password" name="password" value="">* Password
                    <br><br>
                    <input type="password" name="password" value="">* Re enter Password
                    <br><br>
                      <input type="text" name="Year" value="" maxlength="4" minlength="4" size="4" pattern="\d{4}" required> *Year of birth
            <br><br>
            month of birth
            <select name="Month" value="" required> 
                <option>January</option>
                <option>February</option>
                <option>March</option>
                <option>April</option>
                <option>May</option>
                <option>June</option>
                <option>July</option>
                <option>August</option>
                <option>September</option>
                <option>October</option>
                <option>November</option>
                <option>December</option>
            </select>
            <br><br>
            <input type="number" name="Day" value="" size="2" value="1" min="1" max="31" step="1" required> *day
            <br><br>
                    <input type="submit" name="submit" value="Enter">
                    <p>* - required field</p>
                </fieldset>
            </form>
</body>
</html>