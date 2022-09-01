package com.api.ErrorApi.Modele;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String nom;
    private String prenom;
    //private long numero;
<<<<<<< HEAD
    private String Email;
=======
    private String email;
>>>>>>> 37afce1de36853bcb19cabaccd0c5315a83ae23a
    private String password;
    private int contact;


    @ManyToOne
    private role Role;
}
