<!DOCTYPE html>
<html>
<head>
    <title>КИНОСТУДИЯ</title>
</head>
<body>
<h1>КИНОСТУДИЯ</h1><hr>
<#list review as review>
    <div>
        <p><b>${review.nickname}</b> ${review.rating} ${review.review}</p>
    </div>
    <#else>
    <h3>Товаров нет</h3>
</#list>
</body>
</html>