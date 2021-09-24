package com.example.projet;

import com.example.projet.dao.CollaborateurRepository;
import com.example.projet.dao.ManagerRHRepository;
import com.example.projet.model.Collaborateur;
import com.example.projet.model.ManagerRH;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootTest
class ProjetApplicationTests {

	@Autowired
	private CollaborateurRepository collaborateurRepository;
	@Autowired
	private ManagerRHRepository managerRHRepository;

	@Test
	public void testCreateCollaborateur() throws ParseException {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Collaborateur C= new Collaborateur(122,
				"bennani",
				"ali",
				'M',
				"BA",
				df.parse("30/06/2025"),
				df.parse("30/06/2020"),
				df.parse("14/02/2021"),
				false, true, 30000);

		ManagerRH M1= new ManagerRH(172,
				"alaoui",
				"youssef",
				'M',
				"AY",
				df.parse("30/06/2025"),
				df.parse("30/06/2020"),
				df.parse("14/02/2021"),
				false, true, 30000, true, "youssef", "12345");

		collaborateurRepository.save(C);
		managerRHRepository.save(M1);

	}


}
