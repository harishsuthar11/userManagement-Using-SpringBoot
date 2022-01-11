package com.example;

import com.example.User;
import com.example.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo repo;



    public List<User> listAll() {
        return repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Integer userID) {
        return repo.findById(userID).get();
    }

    public void delete(Integer userID) {
        repo.deleteById(userID);
    }




}