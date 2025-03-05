package com.flores.v1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.flores.v1.Model.UserModel;
import com.flores.v1.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
     
    UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        

    }


    @Override
    public List<UserModel> listar() {
        return (List<UserModel>) userRepository.findAll();

    }


    @Override
    public UserModel listarId(Long id) {
        return userRepository.findById(id).get();
    }
    
}
