package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.commentaire;
import com.api.ErrorApi.Reposotory.commentaireReposotory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class impltcommentaire implements commentaireService{
    @Autowired
    private final commentaireReposotory cp;



    @Override
    public commentaire creer_commentaire(commentaire commentaireservice) {
        return cp.save(commentaireservice);
    }

    @Override
    public List<commentaire> afficher_commentaire() {
        return cp.findAll();
    }

    @Override
    public commentaire lecture_commentaire(commentaire commentaireservice) {
        return cp.save(commentaireservice);
    }
}
