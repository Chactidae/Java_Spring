<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>ФАНАТСКАЯ АТРИБУТИКА</h1><hr>
<form action="/user_order/sortD" method="get">
    (Запрос 4) Отсортировать товары по цене
    <input type="submit" value="По возрастанию"/>
</form>
<form action="/user_order/sort" method="get">
    <input type="submit" value="По убыванию"/>
</form>
<#list user_order as user_order>
    <div>
        <p><b>${user_order.o_type}</b> ${user_order.o_name} ${user_order.price} | <a href="/user_order/${user_order.id}">Подробнее...</a></p> </p>
    </div>
    <#else>
    <h3>Товаров нет</h3>
</#list>
<hr>
<h3>Добавить товар</h3>
<form action="/user_order/create" method="post">
    Тип: <input type="text" name="o_type"/><br><br>
    Название: <input type="text" name="o_name"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Фильм: <input type="number" name="film_id"/><br><br>
    <input type="submit" value="Добавить товар"/>
</html>