package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.user;
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
        @PostMapping("/create")

        public user creation(@RequestBody user User){
            return  us.creer_compte(User);
        }
        @DeleteMapping("/supprimer/{iduser}")
        public String supprimer(@PathVariable ("id") int id) {
            return us.SuppUser(id);
        }


        @GetMapping("/afficher")
        public List<user> afficher(){
            return  us.Afficher_user();
        }





    }


