package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.commentaire;
import com.api.ErrorApi.Service.commentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Commentaire")
public class controllercommentaire {
    @Autowired
    private commentaireService CS;


@PostMapping("/create")
public  commentaire creer_commentaire(commentaire commentaireservice){
    return CS.creer_commentaire(commentaireservice);
}
@GetMapping("afficher")
public List<commentaire> afficher_commentaire(){
    return CS.afficher_commentaire();
}
@GetMapping("")
public commentaire lecture_commentaire(commentaire commentaireservice){
    return CS.lecture_commentaire(commentaireservice);
}
}
