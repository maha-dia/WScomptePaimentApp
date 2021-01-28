package com.ws.wscomptedepaiment.web;

import com.ws.wscomptedepaiment.entities.Client;
import com.ws.wscomptedepaiment.entities.Compte;
import com.ws.wscomptedepaiment.repositories.ClientRepository;
import com.ws.wscomptedepaiment.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@Component
@WebService(serviceName = "banqueWS")
public class CompteWS {
    @Autowired
    private CompteRepository compteRepository;
    private ClientRepository clientRepository;
    @WebMethod
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

    @WebMethod
    public Compte compteById(@WebParam(name = "id") String id){
        return compteRepository.findById(id).get();
    }
    @WebMethod
    public Compte saveComte(@WebParam(name = "id") String id, String nom,String prenom, String numero){
        Client client=clientRepository.findById(id).get();
        Compte compte= new Compte(null,0,new Date(),client);
        compteRepository.save(compte);
        return compteRepository.findById(id).get();
    }
    @WebMethod
    public Boolean verifierSolde(@WebParam(name = "id") String idCompte){
        Compte compte=compteRepository.findById(idCompte).get();
        if(compte.getSolde()<20000) return true;
        else return false;

    }


}
