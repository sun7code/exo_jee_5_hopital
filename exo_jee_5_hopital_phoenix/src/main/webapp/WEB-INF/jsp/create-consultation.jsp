<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Créer une consultation</title>
</head>
<body>
<h1>Créer une consultation</h1>
<form action="create-consultation" method="post">
  Date de consultation: <input type="date" name="dateConsultation" required><br>
  Nom du médecin: <input type="text" name="nomMedecin" required><br>
  Prescription: <textarea name="prescription" required></textarea><br>
  <input type="hidden" name="patientId" value="${patientId}">
  <button type="submit">Enregistrer</button>
</form>
</body>
</html>
