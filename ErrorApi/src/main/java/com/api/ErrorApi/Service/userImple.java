package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Probleme;
import com.api.ErrorApi.Modele.Solution;
import com.api.ErrorApi.Modele.user;
import com.api.ErrorApi.Repository.SolutionRepository;
import com.api.ErrorApi.Reposotory.UserReposotory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class userImple implements userService{


    private final UserReposotory userReposotory;

    private final SolutionRepository solutionRepository;


   /* @Override
    public Solution trouverSolutionParIdProbleme(Long idPro) {
        return null;
    }*/

    @Override
    public user trouverCompteParEmail(String email) {
        return userReposotory.findByEmail(email);
    }

    @Override
    public user creer_compte(user userservice) {
        return userReposotory.save(userservice);
    }

    @Override
    public user poser_probleme(user userservice) {
        return userReposotory.save(userservice);
    }

    @Override
    public List<user> Afficher_user() {
        return userReposotory.findAll();
    }

    @Override
    public user commenter(user userservice) {
        return userReposotory.save(userservice);
    }

    @Override
    public user creer_solution(user userservice) {
        return null;
    }

    @Override
    public user ajouter_user(user userservice) {
        return null;
    }

    @Override
    public String SuppUser(int id) {
        userReposotory.deleteById(id);
        return "supprimer avec succès";
    }


    @Override
    public user trouverUserParEmail(String email) {
        return userReposotory.findByEmail(email);
    }

    @Override
    public boolean Connexion(String email, String password) {
        user user1 = userReposotory.findByEmail(email);
        if (user1 != null && user1.equals(password)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Solution creerSolution(Solution solution, Probleme prob) {
        solution.setProbleme(prob);
        return solutionRepository.save(solution);
    }

    @Override
    public Solution trouverSolutionParIdProbleme(Long idPro) {
        return solutionRepository.findById(idPro).get();
    }
}
