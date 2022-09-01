package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Probleme;


import java.util.List;
public interface ProblemeService {

    Probleme creer (Probleme probleme);

    List<Probleme> lire();

    Probleme modifier(Long id, Probleme probleme);

    String supprimer(Long id);

    Probleme trouverProblemeParId(Long id) ;

    Probleme touverProblemeParTitre(String titre) ;
    Object recherche_motcles(String mot_cle);

   // Probleme modifier(Long id, Probleme probleme);
}
