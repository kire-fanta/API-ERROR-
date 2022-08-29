package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.role;
import com.api.ErrorApi.Reposotory.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleImpl implements Role{

    @Autowired
    private RoleRepo rp;
    @Override
    public Optional<role> findRole(int id) {
        return rp.findById(id);
    }
}
