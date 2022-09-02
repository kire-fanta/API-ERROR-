package com.api.ErrorApi.Reposotory;

import com.api.ErrorApi.Modele.role;
import com.api.ErrorApi.Modele.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleRepo extends JpaRepository<role, Long> {
    //role findByNom(String nom);

}
