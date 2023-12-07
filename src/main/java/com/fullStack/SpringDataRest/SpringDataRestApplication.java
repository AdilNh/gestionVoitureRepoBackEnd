package com.fullStack.SpringDataRest;

import com.fullStack.SpringDataRest.modele.Proprietaire;
import com.fullStack.SpringDataRest.modele.ProprietaireRepo;
import com.fullStack.SpringDataRest.modele.Voiture;
import com.fullStack.SpringDataRest.web.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRestApplication {
@Autowired
private VoitureRepo repository;
@Autowired
private ProprietaireRepo proprietaireRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
@Bean
		CommandLineRunner runner(){
		return args -> {
	Proprietaire proprietaire1 = new Proprietaire("ANH" , "Adil");
	Proprietaire proprietaire2 = new Proprietaire("NH","Anass");
	proprietaireRepo.save(proprietaire1);
	proprietaireRepo.save(proprietaire2);
	repository.save(new Voiture("Seat","Leon","Blanche","E-1-81",2019,220000,proprietaire1));
	repository.save(new Voiture("Toyota","Corolla","Gris","A-1-9090",2018,95000,proprietaire1));
	repository.save(new Voiture("Ford","Fiesta","rouge","A-2-8090",2015,90000,proprietaire2));
};
}


//	CommandLineRunner runner(){
//		return args -> {
//			repository.save(new Voiture("Toyota","Corolla","Gris","A-1-9090",2018,95000));
//			repository.save(new Voiture("Ford","Fiesta","rouge","A-2-8090",2015,90000));
//			repository.save(new Voiture("Honda","CRV","Bleu","A-3-7090",2016,140000));
//		};
//}

}
