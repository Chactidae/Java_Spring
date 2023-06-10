<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<h4>Пользователи</h4>
<#list account as account>
    <div>
        <p><b>${account.nickname}</b> ${account.access_level} | <a href="/account/${account.id}">Подробнее...</a></p>
    </div>
    <#else>
    <h3>Товаров нет</h3>
</#list>
<hr>
<h3>Добавить пользователя</h3>
<form action="/account/create" method="post">
    Никнейм: <input type="text" name="nickname"/><br><br>
    Аватар: <input type="text" name="avatar"/><br><br>
    Уровень доступа: <input type="text" name="access_level"/><br><br>
    Запись пользователя: <input type="number" name="user_record_id"/><br><br>
    Запись корзины: <input type="number" name="cart_id"/><br><br>
    <input type="submit" value="Добавить пользователя"/>
</form>
</body>
</html>
