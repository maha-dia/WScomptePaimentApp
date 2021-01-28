package com.ws.wscomptedepaiment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Compte {
    @Id
    private String id;
    private static final String type = "paiment";
    private double solde;
    private Date dateCreation;
    @DBRef
    private Client client;
}
