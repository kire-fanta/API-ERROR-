package com.api.ErrorApi.Modele;

import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
@Entity
@Table(name = "user")
@Getter
@Setter
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String nom;
    private String prenom;
    private long numero;
    private String Email;
    private String password;
    private int contact;

    @ManyToOne
    private role Role;
}
