package finalMock;

import java.io.FileInputStream;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args)throws IOException {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("final");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student s2= new Student();
		s2.setsName("Rathan");
		s2.setsPer(94.5);
		FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Rathan\\Pictures\\WhatsApp Image 2023-04-24 at 14.47.32.jpg");
		byte[] arr= new byte [fileInputStream.available()];
		fileInputStream.read (arr);
	s2.setArr(arr);
		entityTransaction.begin();
		entityManager.persist(s2);
		entityTransaction.commit();
	}

}
