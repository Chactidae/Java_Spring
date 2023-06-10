<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<form action="/artist/req" method="get">
    (Запрос 3) Вывести всех художников чей возраст не превышает: <input type="number" name="current"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list artist as artist>
    <div>
        <p><b>${artist.fio}</b> ${artist.age} лет. </p>
    </div>
    <#else>
    <h3>Художники не найдены</h3>
</#list>
</body>
</html>