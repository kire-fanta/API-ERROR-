package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.role;

import java.util.Optional;

public interface Role {

    Optional<role> findRole(int id);
}
