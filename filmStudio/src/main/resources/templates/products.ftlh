<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<form action="/" method="get">
    Поиск по названию произведения: <input type="text" name="f_name"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list film as film>
    <div>
        <p><b>${film.f_name}</b> ${film.duration} мин. | <a href="/film/${film.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Фильмов нет</h3>
</#list>
<form action="/reset" method="get">
    <input type="submit" value="Сбросить"/>
</form>
<hr>
<h3>Опубликовать новый фильм</h3>
<form action="/film/create" method="post">
    Название фильма: <input type="text" name="f_name"/><br><br>
    Длительность фильма: <input type="number" name="duration"/><br><br>
    Имя: <input type="number" name="author"/><br><br>
    Информация: <input type="number" name="film_info_id"/><br><br>
    Художник: <input type="number" name="artist_id"/><br><br>
    Отзыв: <input type="number" name="review_id"/><br><br>
    <input type="submit" value="Добавить фильм"/>
    <p><a href="/film/author">Перейти к авторам...</a></p>
    <p><a href="/film/review">Перейти к отзывам...</a></p>
    <p><a href="/film/user_order">Перейти в магазин фанатской продукции...</a></p>
    <p><a href="/film/account">Перейти к списку пользователей...</a></p>
    <p><a href="/film/artist">Перейти к художникам...</a></p>
    <p><a href="/film/request">Сделать запрос в качестве администратора</a></p>
</body>
</html>