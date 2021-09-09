package com.example.projet;

import com.example.projet.dao.CollaborateurRepository;
import com.example.projet.dao.ManagerRHRepository;
import com.example.projet.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ProjetApplication {

@Autowired
private CollaborateurRepository collaborateurRepository;
@Autowired
private ManagerRHRepository managerRHRepository;


	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}
//voir l insertion dans le fichier config
//	@Override
//	public void run(String... arg0) throws Exception {
//
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//
//		//Donnees du collaborateur
//		Profil P= new Profil("technicien");
//		Site S= new Site("www.xxxx.com");
//		ArchiveSalaire A= new ArchiveSalaire(df.parse("22/01/2021"), df.parse("22/12/2021"),20000);
//
//		//Donnees du Manager
//		Profil P1= new Profil("manager");
//		Site S1= new Site("www.xxxx.com");
//		ArchiveSalaire A1= new ArchiveSalaire(df.parse("30/07/2020"), df.parse("30/06/2025"),30000);
//
//		/*ManagerRH M1= new ManagerRH( 172, "bennani", "ali", 'M',"BA", df.parse("30/06/2025"), df.parse("30/06/2020"),df.parse("14/02/2021"),false, true, 30000,P1, S1, A1, true, "alibennani", "12345");
//		managerRHRepository.save(M1);*/
//
//		/*Collaborateur C= new Collaborateur(123,"alaoui", "amine", 'M', "AA", df.parse("22/12/2022"), df.parse("22/12/2020"), df.parse("6/5/2021"), false, true, 250000, P, S, A, M1);
//	    collaborateurRepository.save(C);*/
//	}
}
