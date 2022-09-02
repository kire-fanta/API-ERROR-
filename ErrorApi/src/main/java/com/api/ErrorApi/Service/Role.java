package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface Role {
    role ajouter_role(role Role);
    List<role> Afficher();

    Optional<role> findRole(Long id);
}
