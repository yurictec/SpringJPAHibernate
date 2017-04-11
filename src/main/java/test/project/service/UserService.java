package test.project.service;

import test.project.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(int id);
}
