<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Détails du patient</title>
</head>
<body>
<h1>Détails du patient</h1>
<p>${patient}</p>
<a href="create-consultation?patientId=${patient.id}">Ajouter une consultation</a>
</body>
</html>
