<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<h4>Подробная информация о произведении</h4>
<b>Тип товара: </b>${user_order.o_type}<br>
<b>Название: </b>${user_order.o_name}<br>
<b>Цена: </b>${user_order.price}<br>
<b>Фильм: </b>${user_order.film_id}<br>
<hr>
<form action="/user_order/delete/${user_order.id}" method="post">
    <input type="submit" value="Удалить товар"/>
</form>
<h3>Редактировать товар</h3>
<form action="/user_order/update/${user_order.id}" method="post">
    Тип: <input type="text" name="o_type"/><br><br>
    Название: <input type="text" name="o_name"/><br><br>
    Цена: <input type="number" name="price"/><br><br>
    Фильм: <input type="number" name="film_id"/><br><br>
    <input type="submit" value="Обновить товар"/>
</body>
</html>