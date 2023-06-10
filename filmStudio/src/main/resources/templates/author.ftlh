<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<h4>Авторы</h4>
<#list author as author>
    <div>
        <p><b>${author.fio}</b> ${author.age} лет. | <a href="/author/${author.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Товаров нет</h3>
</#list>
<hr>
<h3>Добавить Автора</h3>
<form action="/author/create" method="post">
    avatar: <input type="text" name="avatar"/><br><br>
    fio: <input type="text" name="fio"/><br><br>
    age: <input type="text" name="age"/><br><br>
    <input type="submit" value="Добавить автора"/>
</html>
