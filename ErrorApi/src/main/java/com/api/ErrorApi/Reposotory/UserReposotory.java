package com.api.ErrorApi.Reposotory;

import com.api.ErrorApi.Modele.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposotory extends JpaRepository<user, Integer> {
    user findByEmail(String email);

}
