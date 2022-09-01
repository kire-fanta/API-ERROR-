package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.Probleme;
import com.api.ErrorApi.Modele.Solution;
import com.api.ErrorApi.Modele.user;
import com.api.ErrorApi.Service.ProblemeService;
import com.api.ErrorApi.Service.SolutionService;
import com.api.ErrorApi.Service.userService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solution")
@AllArgsConstructor
public class SolutionController {

    @Autowired
    final private SolutionService solutionService;

    final private  userService userService;

    final private ProblemeService problemeService;

    @PostMapping("/create")
    public Solution create(@RequestBody Solution solution) {
        return solutionService.creer(solution);
    }

    @GetMapping("/read")
    public List<Solution> read() {
        return solutionService.lire();
    }
    @PutMapping("/update/{id}")
    public Solution update(@PathVariable int id, @RequestBody Solution solution){
        return solutionService.modifier(id, solution);

    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable int id){
        return solutionService.supprimer(id);
    }

    @PostMapping("/ajouter/{email}/{password}/{titre}")
    public String ajouter( @RequestBody Solution solution, @PathVariable String email ,@PathVariable String password ,@PathVariable  String titre){

        //Recuperer le probleme sur laquel la solution doit être postée
        Probleme prob = problemeService.touverProblemeParTitre(titre);

        //Verifier si le probleme existe ou pas
        if (prob != null){
            //recuperation de l'id du probleme
            Long idPro = prob.getId();

            //recuperer l'id de l'utilisateur qui a posté le probleme

            long id_userProbleme = problemeService.trouverProblemeParId(idPro).getUser().getId();

            //Recuperer le compte de l'utilisateur qui veut résoudre le probleme par son email
         user user1 = userService.trouverCompteParEmail(email);

            //Recuperer l'id de l'user qui veut poster une solution

            //Long id_useSolution = userService.trouverUserParCompte(compte);
            //si email et password de l'user sont corrects

            int id_useSolution = user1.getId();

            if(userService.Connexion(email, password) && id_userProbleme == id_useSolution){

                if (userService.trouverSolutionParIdProbleme(idPro) == null){

                    //creation de la solution
                    Solution solu = userService.creerSolution(solution, prob);
                    //solu.setProbleme(prob);
                    return  "Solution ajouter avec succès";
                }
                else {
                    return " Ce probleme a été déjà";
                }
            }else {
                return  " Acces refusé";
            }

        }else {
            return "Ce probleme n'existe pas";
        }

    }

}
