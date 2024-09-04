<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des patients</title>
</head>
<body>
<h1>Liste des patients</h1>
<form action="list-patients" method="get">
    Recherche: <input type="text" name="search">
    <button type="submit">Rechercher</button>
</form>
<ul>
    <c:forEach var="patient" items="${patients}">
        <li><a href="patient-details?id=${patient.id}">${patient.nom} ${patient.prenom}</a></li>
    </c:forEach>
</ul>
</body>
</html>
