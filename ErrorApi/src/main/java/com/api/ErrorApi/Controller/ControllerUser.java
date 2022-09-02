package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.user;
import com.api.ErrorApi.Reposotory.UserReposotory;
import com.api.ErrorApi.Service.userImple;
import com.api.ErrorApi.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControllerUser {


    @Autowired
    private userService us;

    @Autowired
    private UserReposotory userReposotory;

    @PostMapping("/create")

    public user creation(@RequestBody user User) {
        return us.creer_compte(User);
    }

    @DeleteMapping("/supprimer/{email}/{role}/{id}")
    public String supprimer(@PathVariable(name = "email") String email, @PathVariable("id") Long id, @PathVariable String role) {

        String essai = "Admin";

        //user user1 = userReposotory.findByEmail(email);
        user user1 = us.trouverUserParEmail(email);

        //  Long IdUser=user1.getId();

        if (user1 == null) return "ce compte n'existe pas";

        else if (user1.getRole().equals(role) && user1.getRole().equals(essai) ) {
                this.us.SuppUser(id);
             return"compte supprimer avec succes";
            //return "";

        }
        else return "Vous ne pouvez pas le supprimerr";

           /* else if(user1.getRole().getId().equals(1L))
            {
               us.SuppUser(id);
                return"Compte supprimer par l'administrateur";

            }

            else{
                return"Vous n'avez pas le droit d'executer cette requette";
            }*/



    }




        @GetMapping("/afficher")
        public List<user> afficher(){
            return  us.Afficher_user();
        }


    }


