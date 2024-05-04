package jpaprimer;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import jpaprimer.generated.*;

public class WritingData {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Escrita na Base de Dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Series");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		trx.begin();
		// Leitura do Ficheiro XML para uma lista de Séries
		File xmlFile = new File("SeriesCatalog.xml");

		JAXBContext jaxbContext = null;
		Catalog catalog = null;

		try {
			jaxbContext = JAXBContext.newInstance(Catalog.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			catalog = (Catalog) jaxbUnmarshaller.unmarshal(xmlFile);
			// System.out.println(catalog.getSerie().get(0).getTitle());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		System.out.println("-----Series-----");
		for (Serie serie : catalog.getSerie()) {
			System.out.println(serie.getTitle());
		}

		for (Serie serie : catalog.getSerie()) {
			em.persist(serie);
		}

		trx.commit();
		em.close();
		emf.close();

		System.out.println("-----Done-----");
	}

}
