package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Probleme;
import org.springframework.beans.factory.parsing.Problem;

import java.util.List;
public interface ProblemeService {

    Probleme creer (Probleme probleme);

    List<Probleme> lire();

    Probleme modifier(Long id, Probleme probleme);

    String supprimer(Long id);


   // Probleme modifier(Long id, Probleme probleme);
}
