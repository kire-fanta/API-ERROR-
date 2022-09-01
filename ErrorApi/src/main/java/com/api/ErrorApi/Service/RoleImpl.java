package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.role;
import com.api.ErrorApi.Reposotory.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleImpl implements Role{

    @Autowired
    private RoleRepo rp;

    @Override
    public role ajouter_role(role Role) {
        return rp.save(Role);
    }

    @Override
    public List<role> Afficher() {
        return rp.findAll();
    }

    @Override
    public Optional<role> findRole(int id) {
        return rp.findById(id);
    }
}
