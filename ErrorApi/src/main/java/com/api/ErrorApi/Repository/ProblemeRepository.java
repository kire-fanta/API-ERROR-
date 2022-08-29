package com.api.ErrorApi.Repository;

import com.api.ErrorApi.Modele.Probleme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemeRepository extends JpaRepository<Probleme, Long> {
}
