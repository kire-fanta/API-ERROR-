package com.api.ErrorApi.Controller;

import com.api.ErrorApi.Modele.Probleme;
import com.api.ErrorApi.Service.ProblemeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probleme")
@AllArgsConstructor
public class ProblemeController {

    @Autowired
    private final ProblemeService problemeService;

    @PostMapping("/create")
    public Probleme create(@RequestBody Probleme probleme) {

        return problemeService.creer(probleme);
    }

    @GetMapping("/read")
    public List<Probleme> read() {

        return problemeService.lire();
    }

   @PutMapping("/update/{id}")
    public Probleme update(@PathVariable Long id, @RequestBody Probleme probleme) {
        return problemeService.modifier(id, probleme);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return problemeService.supprimer(id);
    }

}
