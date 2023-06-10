<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<h4>Подробная информация о пользователе</h4>
<b>ФИО: </b>${user_record.fio}<br>
<b>Email: </b>${user_record.email}<br>
<b>Дата рождения: </b>${user_record.birthday}<br>
<b>Адрес доставки: </b>${user_record.delivery_address}<br>
<b>Адрес выставления счёта: </b>${user_record.payment_address}<br>
<hr>
<form action="/account/delete/${account.id}" method="post">
    <input type="submit" value="Удалить запись"/>
</form>
</body>
</html>