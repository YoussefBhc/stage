package com.example.projet.controllers;


import com.example.projet.entities.Collaborateur;
import com.example.projet.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
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
        String msg ="Collaborateurt enregistré avec le matricule "+saveCollaborateur.getMatricule();
        modelMap.addAttribute("msg", msg);
        return "createCollaborateur";
    }

    @RequestMapping("/ListeCollaborateurs")
    public String listeCollaborateurs(ModelMap modelMap)
    {
        List<Collaborateur> collabs = collaborateurService.getAllCollaborateurs();
        modelMap.addAttribute("collaborateurs", collabs);
        return "listeCollaborateurs";
    }

    @RequestMapping("/supprimerCollaborateur")
    public String supprimerCollaborateur(@RequestParam("id") int id,
                                   ModelMap modelMap)
    {
        collaborateurService.deleteCollaborateurById(id);
        List<Collaborateur> collabs = collaborateurService.getAllCollaborateurs();
        modelMap.addAttribute("collaborateurs",collabs);
        return "listeCollaborateurs";
    }

    @RequestMapping("/modifierCollaborateur")
    public String editerCollaborateur(@RequestParam("id")int id,ModelMap modelMap)
    {
        Collaborateur p= collaborateurService.getCollaborateur(id);
        modelMap.addAttribute("collaborateur", p);
        return "editerCollaborateur";
    }
    @RequestMapping("/updateCollaborateur")
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
    }


}
