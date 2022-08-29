package com.api.ErrorApi.Modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="role")
@Getter
@Setter
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
}
