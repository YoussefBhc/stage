package com.example.projet.model;


import com.example.projet.dao.CollaborateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Configuration
public class CollaborateurConfig {
//decommenter cette ligne pour pouvoir inserer dans la bdd
//    @Bean
    CommandLineRunner commandLineRunner(CollaborateurRepository collaborateurRepository) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//
//		//Donnees du collaborateur
//		Profil P= new Profil("technicien");
//		Site S= new Site("www.xxxx.com");
//		ArchiveSalaire A= new ArchiveSalaire(df.parse("22/01/2021"), df.parse("22/12/2021"),20000);
//
//		//Donnees du Manager
		Profil P1= new Profil("manager");
		Site S1= new Site("www.xxxx.com");
		ArchiveSalaire A1= new ArchiveSalaire(df.parse("30/07/2020"), df.parse("30/06/2025"),30000);


        return args -> {
           Collaborateur M1= new ManagerRH( 172,
                    "bennani",
                    "ali",
                    'M',
                    "BA",
                    df.parse("30/06/2025"),
                    df.parse("30/06/2020"),
                    df.parse("14/02/2021"),
                    false, true, 30000,P1, S1, A1, true, "alibennani", "12345");

           collaborateurRepository.save(M1);

    };

}
}
