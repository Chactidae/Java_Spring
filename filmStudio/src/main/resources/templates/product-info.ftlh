<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<h4>Подробная информация о произведении</h4>
<b>Название произведения: </b>${film.f_name}<br>
<b>Длительность произведения: </b>${film.duration}<br>
<b>Страна: </b>${film_info.country}<br>
<b>Дата релиза: </b>${film_info.release_date}<br>
<b>Информация о премьере: </b>${film_info.premiere_info}<br>
<b>номер авторского права: </b>${film_info.copyright_id}<br>
<b>Автор: </b>${author.fio}<br>
<hr>
<form action="/film/delete/${film.id}" method="post">
    <input type="submit" value="Удалить запись"/>
</form>
<h3>Опубликовать новый фильм</h3>
<form action="/film/update/${film.id}" method="post">
    Название фильма: <input type="text" name="f_name"/><br><br>
    Длительность фильма: <input type="number" name="duration"/><br><br>
    Имя: <input type="number" name="author"/><br><br>
    Информация: <input type="number" name="film_info_id"/><br><br>
    Художник: <input type="number" name="artist_id"/><br><br>
    Отзыв: <input type="number" name="review_id"/><br><br>
    <input type="submit" value="Обновить фильм"/>
</form>
</body>
</html>