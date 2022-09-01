package com.api.ErrorApi.Modele;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Solution")
@Getter
@Setter
@NoArgsConstructor

public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    @Column(length = 158)
    private int temps;
    private String ressources;

    @OneToOne
    @JoinColumn(name = "id")
    private Probleme probleme;
}

