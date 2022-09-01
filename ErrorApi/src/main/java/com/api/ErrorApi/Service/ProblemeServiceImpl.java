package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Probleme;
import com.api.ErrorApi.Repository.ProblemeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProblemeServiceImpl implements ProblemeService{

    private final ProblemeRepository problemeRepository;

    @Override
    public Probleme creer(Probleme probleme) {
        return problemeRepository.save(probleme);
    }

    @Override
    public List<Probleme> lire() {
        return problemeRepository.findAll();
    }

   @Override
    public Probleme modifier(Long id, Probleme probleme) {
        return problemeRepository.findById(id)
                .map(p-> {
                    p.setTitre(p.getTitre());
                    p.setDescription(p.getDescription());
                    p.setTechnologie(p.getTechnologie());
                    p.setMethodologie(p.getMethodologie());
                    p.setEtats(p.getEtats());
                    return problemeRepository.save(p);
                }).orElseThrow(() ->new RuntimeException("Probleme non trouver !"));
    }

    @Override
    public String supprimer(Long id) {
        problemeRepository.deleteById(id);
        return "Probleme supprimer !";
    }

    /*@Override
    public Probleme modifier(Long id, Probleme probleme) {
        return null;
    }*/
    @Override
    public Probleme trouverProblemeParId(Long id) {
        return problemeRepository.findById(id).get();
    }

    @Override
    public Probleme touverProblemeParTitre(String titre) {

        return problemeRepository.findByTitre(titre);
    }

    @Override
    public Object recherche_motcles(String mot_cle) {
        if(mot_cle != null){
            List<Probleme> recherche =problemeRepository.findAll(mot_cle);

            if (recherche.size() != 0){
                return recherche;
            }else {
                return "Desole ce mot est introuvable";
            }
        }
        return problemeRepository.findAll();
    }


}
