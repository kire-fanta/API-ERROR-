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
    public Solution modifier(int id, Solution solution) {
        return solutionRepository.findById((long) id)
                .map(p-> {
                    p.setDescription(solution.getDescription());
                    p.setTemps(solution.getTemps());
                    p.setRessources(solution.getRessources());
                    return solutionRepository.save(p);

                }).orElseThrow(() -> new RuntimeException("Solution non trouvé !"));
    }

    @Override
    public String supprimer(int id) {
        solutionRepository.deleteById(id);
        return "Solution supprimer !";
    }
}
