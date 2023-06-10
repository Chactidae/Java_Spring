<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<h4>Подробная информация о произведении</h4>
<b>Имя автора: </b>${author.fio}<br>
<b>Возраст: </b>${author.age}<br>
<hr>
<form action="/author/delete/${author.id}" method="post">
    <input type="submit" value="Удалить автора"/>
</form>
<h3>Обновить Автора</h3>
<form action="/author/update/${author.id}" method="post">
    avatar: <input type="text" name="avatar"/><br><br>
    fio: <input type="text" name="fio"/><br><br>
    age: <input type="text" name="age"/><br><br>
    <input type="submit" value="Добавить автора"/>
</body>
</html>