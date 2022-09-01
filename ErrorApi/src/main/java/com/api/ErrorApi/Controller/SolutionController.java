package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.Solution;
import com.api.ErrorApi.Service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solution")
@AllArgsConstructor
public class SolutionController {


    private final SolutionService solutionService;
    @PostMapping("/create")
    public Solution create(@RequestBody Solution solution) {
        return solutionService.creer(solution);
    }

    @GetMapping("/read")
    public List<Solution> read() {
        return solutionService.lire();
    }
    @PutMapping("/update/{id}")
    public Solution update(@PathVariable long id, @RequestBody Solution solution){
        return solutionService.modifier(id, solution);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
     solutionService.supprimer(id);
        return "Supprimer avec succès";

    }

}
