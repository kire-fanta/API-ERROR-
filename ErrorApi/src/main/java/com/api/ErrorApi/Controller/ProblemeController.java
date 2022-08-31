package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.Probleme;
import com.api.ErrorApi.Modele.user;
import com.api.ErrorApi.Service.ProblemeService;
import com.api.ErrorApi.Service.userService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probleme")
@AllArgsConstructor
public class ProblemeController {

    @Autowired
    private final ProblemeService problemeService;
    @Autowired
    private final userService  userService1;

    @PostMapping("/create/{email}/{pass}")
    public String create(@RequestBody Probleme probleme, @PathVariable String email, @PathVariable String pass) {

        user user1 = userService1.trouverUserParEmail(email);
        if(user1 != null && user1.getPassword().equals(pass)) {
            problemeService.creer(probleme);
            return "probleme crée avec succes";
        }else{
            return "acces refusé";
        }

    }

    @GetMapping("/read")
    public List<Probleme> read() {

        return problemeService.lire();
    }

   @PutMapping("/update/{id}")
    public Probleme update(@PathVariable Long id, @RequestBody Probleme probleme) {
        return problemeService.modifier(id, probleme);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return problemeService.supprimer(id);
    }

}
