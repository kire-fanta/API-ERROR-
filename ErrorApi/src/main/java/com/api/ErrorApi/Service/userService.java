package com.api.ErrorApi.Service;

import com.api.ErrorApi.Modele.user;

import java.util.List;

public interface userService {
user creer_compte(user userservice);
user poser_probleme(user userservice);
List<user> Afficher_user();
user commenter(user userservice);
user creer_solution(user userservice);
user ajouter_user(user userservice);
String SuppUser(int iduser);

}
