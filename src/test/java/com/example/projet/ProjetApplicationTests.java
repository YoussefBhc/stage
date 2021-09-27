package com.example.projet;

import com.example.projet.repositories.CollaborateurRepository;
import com.example.projet.repositories.ManagerRHRepository;
import com.example.projet.entities.Collaborateur;
import com.example.projet.entities.ManagerRH;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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

	@Test
	public void testFindCollaborateur()

	{
		Collaborateur A= collaborateurRepository.findById(7).get();
		System.out.println(A);
	}

	@Test
	public void testUpdateCollaborateur()
	{
		Collaborateur A= collaborateurRepository.findById(7).get();
		A.setNomCollaborateur("TARIK");
		collaborateurRepository.save(A);
		System.out.println(A);
	}

	@Test
	public void testDeleteCollaborateur()

	{
		collaborateurRepository.deleteById(8);

	}

	@Test
	public void testFindAllCollaborateur()

	{
		List<Collaborateur> Collabs= collaborateurRepository.findAll();
		for (Collaborateur c:Collabs)
		{
			System.out.println(c);
		}
	}

}
