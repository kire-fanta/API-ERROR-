package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.Solution;

import java.util.List;

public interface SolutionService {

    Solution creer(Solution solution);

    List<Solution> lire();

    Solution modifier(Long id, Solution solution);
    /*String supprimer(Long id);*/


    String supprimer(long id);

    /*Solution modifier(int id, Solution solution);

    String supprimer(int id);*/
}
