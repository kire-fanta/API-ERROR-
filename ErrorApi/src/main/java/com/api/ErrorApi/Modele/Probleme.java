package com.api.ErrorApi.Modele;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "problème")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 58)
    private String titre;
    @Column(length = 158)
    private String description;
    private String technologie;
    private String methodologie;
    private String etats;

    @ManyToOne
    private user user;


}
