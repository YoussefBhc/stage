





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
<title>Modifier un Collaborateur</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateCollaborateur" method="post">


 <div class="form-group">
 <label class="control-label">ID Collaborateur :</label>
 <input type="number" name="idCollaborateur" value="${collaborateur.idCollaborateur}"
class="form-control"/>
 </div>

 <div class="form-group">
 <label class="control-label">Matricule :</label>
  <input type="text" name="matricule" value="${collaborateur.matricule}"
class="form-control"/>
 </div>

 <div class="form-group">
  <label class="control-label">Nom :</label>
   <input type="text" name="nomCollaborateur" value="${collaborateur.nomCollaborateur}"
 class="form-control"/>
  </div>

  <div class="form-group">
    <label class="control-label">Prenom :</label>
     <input type="text" name="prenomCollaborateur" value="${collaborateur.prenomCollaborateur}"
   class="form-control"/>
    </div>

    <div class="form-group">
      <label class="control-label">Sexe:</label>
       <input type="text" name="sexe" value="${collaborateur.sexe}"
     class="form-control"/>
      </div>

      <div class="form-group">
        <label class="control-label">Abreviation :</label>
         <input type="text" name="abreviation" value="${collaborateur.abreviation}"
       class="form-control"/>
        </div>

 <div class="form-group">
 <label class="control-label"> Date Depart :</label>
  <fmt:formatDate pattern="dd/MM/yyyy" value="${collaborateur.dateDepart}"
 var="formatDate" />
  <input type="date" name="dateDepart" value="${formatDate}" class="formcontrol"/>
 </div>


  <div class="form-group">
  <label class="control-label"> Date Embauche:</label>
  <fmt:formatDate pattern="dd/MM/yyyy" value="${collaborateur.dateEmbauche}"
   var="formatDate" />
    <input type="date" name="dateEmbauche" value="${formatDate}" class="formcontrol"/>
  </div>

   <div class="form-group">
   <label class="control-label"> Date Participation Seminaire Integration :</label>
  <fmt:formatDate pattern="dd/MM/yyyy" value="${collaborateur.dateParticipationSeminaireIntegration}"
    var="formatDate" />
     <input type="date" name="dateParticipationSeminaireIntegration" value="${formatDate}" class="formcontrol"/>
   </div>

    <div class="form-group">
           <label class="control-label">Est Parti:</label>
            <input type="boolean" name="estParti" value="${collaborateur.estParti}"
          class="form-control"/>
           </div>

     <div class="form-group">
            <label class="control-label">A participer au seminaire :</label>
             <input type="boolean" name="participationSeminaireIntegration" value="${collaborateur.participationSeminaireIntegration}"
           class="form-control"/>
            </div>

      <div class="form-group">
             <label class="control-label">Salaire:</label>
              <input type="number" name="salaire" value="${collaborateur.salaire}"
            class="form-control"/>
             </div>




 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeCollaborateurs">Liste Collaborateurs</a>
</div>
</body>
</html>