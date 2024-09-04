<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Créer un patient</title>
</head>
<body>
<h1>Créer un patient</h1>
<form action="create-patient" method="post">
    Nom: <input type="text" name="nom" required><br>
    Prénom: <input type="text" name="prenom" required><br>
    Date de naissance: <input type="date" name="dateNaissance" required><br>
    <button type="submit">Créer</button>
</form>
</body>
</html>
