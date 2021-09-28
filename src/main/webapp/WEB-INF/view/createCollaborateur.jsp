

<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>Ajouter Collaborateur</title>
</head>
<body>
<div class="container mt-5" >
<div class="card-body">
<form action="saveCollaborateur" method="post">

<div class="form-group">
 <label class="control-label">Matricule Collaborateur :</label>
 <input type="number" name="matricule" class="form-control"/>
 </div>

 <div class="form-group">
 <label class="control-label">Nom Collaborateur :</label>
 <input type="text" name="nomCollaborateur" class="form-control"/>
 </div>

 <div class="form-group">
  <label class="control-label">Prenom Collaborateur :</label>
  <input type="text" name="prenomCollaborateur" class="form-control"/>
  </div>

  <div class="form-group">
   <label class="control-label">Sexe Collaborateur :</label>
   <input type="text" name="sexe" class="form-control"/>
   </div>

   <div class="form-group">
    <label class="control-label">Abreviation :</label>
    <input type="text" name="abreviation" class="form-control"/>
    </div>


 <div class="form-group">
 <label class="control-label">Date Depart:</label>
 <input type="date" name="dateDepart" class="form-control"/>
 </div>

  <div class="form-group">
  <label class="control-label">Date Embauche:</label>
  <input type="date" name="dateEmbauche" class="form-control"/>
  </div>

   <div class="form-group">
   <label class="control-label">Date Participation Seminaire:</label>
   <input type="date" name="dateParticipationSeminaireIntegration" class="form-control"/>
   </div>
   <div class="form-group">
       <label class="control-label"> Est Parti:</label>
       <input type="boolean" name="estParti" class="form-control"/>
       </div>

    <div class="form-group">
          <label class="control-label"> A participer au seminaire integration:</label>
          <input type="boolean" name="participationSeminaireIntegration" class="form-control"/>
          </div>
     <div class="form-group">
           <label class="control-label"> Salaire :</label>
           <input type="number" name="salaire" class="form-control" />
           </div>




 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
</div>
</form>
</div>
${msg}
<br/>
<br/>
<a href="ListeCollaborateurs">Liste Collaborateurs</a>
</div>
</body>
</html>