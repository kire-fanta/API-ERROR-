package com.api.ErrorApi.Reposotory;

import com.api.ErrorApi.Modele.role;
import com.api.ErrorApi.Modele.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<role, Integer> {
}
