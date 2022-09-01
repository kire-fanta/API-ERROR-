package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Solution;
import com.api.ErrorApi.Repository.SolutionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SolutionServiceImpl implements SolutionService{
    private final SolutionRepository solutionRepository;

    @Override
    public Solution creer(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public List<Solution> lire() {
        return solutionRepository.findAll();
    }

    @Override
    public Solution modifier(Long id, Solution solution) {
        return solutionRepository.findById(id)
                .map(s-> {
                    s.setDescription(s.getDescription());
                    s.setRessources(s.getRessources());
                    s.setTemps(s.getTemps());
                    return solutionRepository.save(s);
                }).orElseThrow(() ->new RuntimeException("solution non trouver !"));
    }

    @Override
    public String supprimer(long id) {
        solutionRepository.deleteById(id);
        return "solution supprimé";
    }
}
