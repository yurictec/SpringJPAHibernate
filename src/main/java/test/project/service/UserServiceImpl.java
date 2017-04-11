package test.project.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.project.entity.User;
import test.project.repository.UserRepository;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return Lists.newArrayList(userRepository.findAll());
    }

    public User getById(int id) {
        return userRepository.findOne(id);
    }
}
