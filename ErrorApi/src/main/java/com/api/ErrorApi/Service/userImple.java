package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.user;
import com.api.ErrorApi.Reposotory.UserReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userImple implements userService{

    @Autowired
    private UserReposotory ur;
    @Override
    public user creer_compte(user userservice) {
        return ur.save(userservice);
    }

    @Override
    public user poser_probleme(user userservice) {
        return ur.save(userservice);
    }

    @Override
    public List<user> Afficher_user() {
        return ur.findAll();
    }

    @Override
    public user commenter(user userservice) {
        return ur.save(userservice);
    }

    @Override
    public user creer_solution(user userservice) {
        return null;
    }

    @Override
    public user ajouter_user(user userservice) {
        return null;
    }

    @Override
    public String SuppUser(int id) {
        ur.deleteById(id);
        return  "supp";
    }

    @Override
    public user trouverUserParEmail(String email) {
        return ur.findByEmail(email);
    }
}
