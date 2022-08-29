package com.api.ErrorApi.Reposotory;

import com.api.ErrorApi.Modele.commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface commentaireReposotory extends JpaRepository<commentaire, Integer> {
}