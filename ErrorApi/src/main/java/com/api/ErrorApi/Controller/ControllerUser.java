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
    private UserReposotory  userReposotory;
        @PostMapping("/create")

        public user creation(@RequestBody user User){
            return  us.creer_compte(User);
        }
        @DeleteMapping("/supprimer/{email}/{id}")
        public String supprimer(@PathVariable ("email") String email,@PathVariable ("id") int id) {

            user user = userReposotory.findByEmail(email);

            if (user.getId() == id)
            {
               us.SuppUser(id);
                return"compte supprimer avec succes";

            }

            else if(user.getRole().equals("Role-Admin"))
            {
               us.SuppUser(id);
                return"Compte supprimer par l'administrateur";

            }

            else{
                return"Vous n'avez pas le droit d'executer cette requette";
            }

        }


        @GetMapping("/afficher")
        public List<user> afficher(){
            return  us.Afficher_user();
        }


    }


