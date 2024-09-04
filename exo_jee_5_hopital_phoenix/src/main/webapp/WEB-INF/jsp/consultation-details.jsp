<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Détails de la consultation</title>
</head>
<body>
<h1>Détails de la consultation</h1>
<p>${consultation}</p>
<a href="create-prescription?consultationId=${consultation.id}">Ajouter une prescription</a><br>
<a href="create-care?consultationId=${consultation.id}">Ajouter une fiche de soin</a>
</body>
</html>
