<html>
    <head>
        <title>用户信息显示</title>
        <meta charset="utf-9"></meta>

    </head>

    <body>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
            </tr>


            <#list list as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.userage}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>