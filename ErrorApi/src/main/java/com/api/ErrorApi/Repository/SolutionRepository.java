package com.api.ErrorApi.Repository;

import com.api.ErrorApi.Modele.Solution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
    void deleteById(int id);
}
