package com.ws.wscomptedepaiment;

import com.ws.wscomptedepaiment.entities.Client;
import com.ws.wscomptedepaiment.entities.Compte;
import com.ws.wscomptedepaiment.repositories.ClientRepository;
import com.ws.wscomptedepaiment.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WscomptedepaimentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WscomptedepaimentApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository, ClientRepository clientRepository){
        return args ->{
            Client cl1= clientRepository.save(new Client(null,"mahdia","saadi","ZA1254","065874958"));
            compteRepository.save(new Compte(null, Math.random()*90, new Date(),cl1 ));

            compteRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    }

}
