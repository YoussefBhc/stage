
<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Collaborateurs</title>
</head>
<body>
<div class="container mt-5" >
<div class="card" >
 <div class="card-header">
 Liste des Collaborateurs
 </div>
 <div class="card-body">

 <table class="table table-striped">
 <tr>

  <th>Matricule</th>
  <th>Nom </th>
  <th>Prenom</th>
  <th>sexe</th>
  <th>abreviation</th>
  <th>dateDepart</th>
  <th>dateEmbauche</th>
  <th>dateParticipationSeminaireIntegration</th>
  <th>estParti</th>
  <th>participationSeminaireIntegration</th>
  <th>salaire</th>
  <th>Suppression</th>
  <th>Edition</th>
 </tr>

 <c:forEach items="${collaborateurs}" var="p">
 <tr>
  <td>${p.matricule }</td>
  <td>${p.nomCollaborateur }</td>
  <td>${p.prenomCollaborateur }</td>
  <td>${p.sexe }</td>
  <td>${p.abreviation }</td>

  <td><fmt:formatDate pattern="dd/MM/yyyy"
 value="${p.dateDepart}" /></td>
  <td><fmt:formatDate pattern="dd/MM/yyyy"
 value="${p.dateEmbauche}" /></td>
  <td><fmt:formatDate pattern="dd/MM/yyyy"
 value="${p.dateParticipationSeminaireIntegration}" /></td>

  <td>${p.estParti }</td>
   <td>${p.participationSeminaireIntegration}</td>
    <td>${p.salaire }</td>


  <td><a onclick="return confirm('Etes-vous sûr ?')"
 href="supprimerCollaborateur?id=${p.idCollaborateur }">Supprimer</a></td>
  <td><a href="modifierCollaborateur?id=${p.idCollaborateur }">Edit</a></td>
  </tr>
 </c:forEach>
 </table>
 </div>
</div>
</div>
</body>
</html>