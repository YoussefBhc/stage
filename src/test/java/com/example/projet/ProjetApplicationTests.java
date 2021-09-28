package com.example.projet;

import com.example.projet.repositories.CollaborateurRepository;
import com.example.projet.repositories.ManagerRHRepository;
import com.example.projet.entities.Collaborateur;
import com.example.projet.entities.ManagerRH;
import com.example.projet.service.CollaborateurService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

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
	@Autowired
	private CollaborateurService collaborateurService;

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
		//managerRHRepository.save(M1);

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

	@Test
	public void testFindByNomCollaborateurContains()
	{
		Page<Collaborateur> collabs = collaborateurService.getAllCollaborateursParPage(0,3);
		System.out.println(collabs.getSize());
		System.out.println(collabs.getTotalElements());

		System.out.println(collabs.getTotalPages());
		collabs.getContent().forEach(p -> {System.out.println(p.toString());
		});
/*ou bien
for (Collaborateur p : collabs)
{
System.out.println(p);
} */
	}

}
