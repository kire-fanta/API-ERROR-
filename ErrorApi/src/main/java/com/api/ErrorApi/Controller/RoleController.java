package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.role;
import com.api.ErrorApi.Modele.user;
import com.api.ErrorApi.Service.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/role")

public class RoleController {
    @Autowired
    private Role rl;

    @PostMapping("/create")
    public role ajouter_role(@RequestBody role Role){
        return rl.ajouter_role(Role);
    }
    @GetMapping("/afficher")
    public List<role> afficher(){
        return  rl.Afficher();
    }
}
