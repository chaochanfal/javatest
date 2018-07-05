<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
</head>
<body>
    <div align="center" style="padding-top: 50px;">
        <form action="login" method="post">
            <table>
                <tr>
                    <td>账号:</td>
                    <td><input type="text" name="userName" id="userName"/></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="password" name="password" id="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="登录"/></td>
                    <font color="red">${error }</font>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>