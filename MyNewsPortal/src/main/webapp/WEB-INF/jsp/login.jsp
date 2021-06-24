<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
</head>
<body>
<body>
            <form action="Controller" method="post">
                <fieldset>
                    <legend>Sign in</legend>
                    <input type="hidden" name="command" value="forward" />
                    <input type="text" name="login" value="">* Login
                    <br><br>
                    <input type="password" name="password" value="">* Password
                    <br>
                    <label>
                        <input type="checkbox" name="Rem" value=""> Remain in the system
                    </label>
                    <br>
                    <input type="submit" name="submit" value="Enter">
                    <p>* - required field</p>
                </fieldset>
            </form>
</body>
</html>