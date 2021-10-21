package com.example.projet.controllers;


import com.example.projet.entities.Collaborateur;
import com.example.projet.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@Controller
public class CollaborateurController {

    @Autowired
    CollaborateurService collaborateurService;

    @RequestMapping("/showCreate")
    public String showCreate()
    {

        return "createCollaborateur";
    }

    @RequestMapping("/saveCollaborateur")
    public String saveCollaborateur(@ModelAttribute("collaborateur")Collaborateur collaborateur,
                                    @RequestParam("dateDepart") String dateDepart,
                                    @RequestParam("dateEmbauche") String dateEmbauche,
                                    @RequestParam("dateParticipationSeminaireIntegration") String dateParticipationSeminaireIntegration,

                                    ModelMap modelMap) throws ParseException
    {
//conversion de la date
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");



        Date date_Depart = dateformat.parse(String.valueOf(dateDepart));
        collaborateur.setDateDepart(date_Depart);


        Date date_Embauche = dateformat.parse(String.valueOf(dateEmbauche));
        collaborateur.setDateEmbauche(date_Embauche);


        Date date_ParticipationSeminaireIntegration = dateformat.parse(String.valueOf(dateParticipationSeminaireIntegration));
        collaborateur.setDateParticipationSeminaireIntegration(date_ParticipationSeminaireIntegration);

        Collaborateur saveCollaborateur = collaborateurService.saveCollaborateur(collaborateur);
        String msg ="Collaborateur enregistré avec le matricule "+saveCollaborateur.getMatricule();
        modelMap.addAttribute("msg", msg);
        return "createCollaborateur";
    }
//on va modifier cette methode pour integrer la pagination
   /* @RequestMapping("/ListeCollaborateurs")
    public String listeCollaborateurs(ModelMap modelMap)
    {
        List<Collaborateur> collabs = collaborateurService.getAllCollaborateurs();
        modelMap.addAttribute("collaborateurs", collabs);
        return "listeCollaborateurs";
    }*/

    @RequestMapping("/ListeCollaborateurs")
    public String listeCollaborateurs(ModelMap modelMap,
                                @RequestParam (name="page",defaultValue = "0") int page,
                                @RequestParam (name="size", defaultValue = "3") int size)
    //le 3 represente combien de pers je veux afficher sur chaque page
    {
        Page<Collaborateur> collabs = collaborateurService.getAllCollaborateursParPage(page, size);
        modelMap.addAttribute("collaborateurs", collabs);
        modelMap.addAttribute("pages", new int[collabs.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "listeCollaborateurs";
    }

    //on va modifier cette methode pour integrer la pagination

   /* @RequestMapping("/supprimerCollaborateur")
    public String supprimerCollaborateur(@RequestParam("id") int id,
                                   ModelMap modelMap)
    {
        collaborateurService.deleteCollaborateurById(id);
        List<Collaborateur> collabs = collaborateurService.getAllCollaborateurs();
        modelMap.addAttribute("collaborateurs",collabs);
        return "listeCollaborateurs";
    }*/

    @RequestMapping("/supprimerCollaborateur")
    public String supprimerCollaborateur(@RequestParam("id") int id,
                                         ModelMap modelMapp,
                                         @RequestParam (name="page",defaultValue = "0") int page,
                                         @RequestParam (name="size", defaultValue = "3") int size)
    {
        collaborateurService.deleteCollaborateurById(id);
        Page<Collaborateur> collabs  = collaborateurService.getAllCollaborateursParPage(page,
                size);
        modelMapp.addAttribute("collaborateurs", collabs);
        modelMapp.addAttribute("pages", new int[collabs.getTotalPages()]);
        modelMapp.addAttribute("currentPage", page);
        modelMapp.addAttribute("size", size);
        return "listeCollaborateurs";
    }

    @RequestMapping("/modifierCollaborateur")
    public String editerCollaborateur(@RequestParam("id")int id,ModelMap modelMap)
    {
        Collaborateur p= collaborateurService.getCollaborateur(id);
        modelMap.addAttribute("collaborateur", p);
        return "editerCollaborateur";
    }
   /* @RequestMapping("/updateCollaborateur")
    public String updateCollaborateur(@ModelAttribute("collaborateur") Collaborateur collaborateur,
                                      @RequestParam("dateDepart") String dateDepart,
                                      @RequestParam("dateEmbauche") String dateEmbauche,
                                      @RequestParam("dateParticipationSeminaireIntegration") String dateParticipationSeminaireIntegration,

                                      ModelMap modelMap) throws ParseException
    {
//conversion de la date
       DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date date_Depart = dateformat.parse(String.valueOf(dateDepart));
        collaborateur.setDateDepart(date_Depart);


        Date date_Embauche = dateformat.parse(String.valueOf(dateEmbauche));
        collaborateur.setDateEmbauche(date_Embauche);


        Date date_ParticipationSeminaireIntegration = dateformat.parse(String.valueOf(dateParticipationSeminaireIntegration));
        collaborateur.setDateParticipationSeminaireIntegration(date_ParticipationSeminaireIntegration);


       collaborateurService.updateCollaborateur(collaborateur);
        List<Collaborateur> collabs = collaborateurService.getAllCollaborateurs();
        modelMap.addAttribute("collaborateurs", collabs);
        return "listeCollaborateurs";
    }*/
   @RequestMapping("/updateCollaborateur")
   public String updateCollaborateur(@ModelAttribute("collaborateur") Collaborateur collaborateur,
                                     @RequestParam("dateDepart") String dateDepart,
                                     @RequestParam("dateEmbauche") String dateEmbauche,
                                     @RequestParam("dateParticipationSeminaireIntegration") String dateParticipationSeminaireIntegration,

                                     ModelMap modelMap,
                                     @RequestParam (name="page",defaultValue = "0") int page,
                                     @RequestParam (name="size", defaultValue = "3") int size) throws ParseException
   {
//conversion de la date
       DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
       Date date_Depart = dateformat.parse(String.valueOf(dateDepart));
       collaborateur.setDateDepart(date_Depart);


       Date date_Embauche = dateformat.parse(String.valueOf(dateEmbauche));
       collaborateur.setDateEmbauche(date_Embauche);


       Date date_ParticipationSeminaireIntegration = dateformat.parse(String.valueOf(dateParticipationSeminaireIntegration));
       collaborateur.setDateParticipationSeminaireIntegration(date_ParticipationSeminaireIntegration);


       collaborateurService.updateCollaborateur(collaborateur);


       Page<Collaborateur> collabs  = collaborateurService.getAllCollaborateursParPage(page,
               size);
      modelMap.addAttribute("collaborateurs", collabs);
       modelMap.addAttribute("pages", new int[collabs.getTotalPages()]);
       modelMap.addAttribute("currentPage", page);
       modelMap.addAttribute("size", size);
       return "listeCollaborateurs";
   }



}
