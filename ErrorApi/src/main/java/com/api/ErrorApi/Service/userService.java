package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Probleme;
import com.api.ErrorApi.Modele.Solution;
import com.api.ErrorApi.Modele.user;

import java.util.List;
import java.util.Optional;

public interface userService {




    user trouverCompteParEmail(String email) ;

    //Object trouverUserParCompte(User compte);


  // boolean Connexion(String email, String password)

   // Solution trouverSolutionParIdProbleme(Long idPro);

    //Solution creerSolution(Solution solution, Probleme prob);

    user creer_compte(user userservice);
    user poser_probleme(user userservice);
    List<user> Afficher_user();
    user commenter(user userservice);
    user creer_solution(user userservice);
    user ajouter_user(user userservice);
    String SuppUser(int id);

    user trouverUserParEmail(String email);

    boolean Connexion(String email, String password);

    Solution creerSolution(Solution solution, Probleme prob);

    Solution trouverSolutionParIdProbleme(Long idPro);
}
