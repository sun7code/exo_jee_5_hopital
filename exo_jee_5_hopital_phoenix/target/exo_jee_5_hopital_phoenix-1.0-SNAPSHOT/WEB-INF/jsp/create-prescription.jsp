<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Créer une prescription</title>
</head>
<body>
<h1>Créer une prescription</h1>
<form action="create-prescription" method="post">
  Contenu de la prescription: <textarea name="contenuPrescription" required></textarea><br>
  <input type="hidden" name="consultationId" value="${consultationId}">
  <button type="submit">Enregistrer</button>
</form>
</body>
</html>
