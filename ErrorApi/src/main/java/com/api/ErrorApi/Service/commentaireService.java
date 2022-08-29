package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.commentaire;

import java.util.List;

public interface commentaireService {
    commentaire creer_commentaire(commentaire commentaireservice);

    List<commentaire> afficher_commentaire();

    commentaire lecture_commentaire(commentaire commentaireservice);
}
