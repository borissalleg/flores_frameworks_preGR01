package com.flores.v1.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flores.v1.Model.UserModel;
@Service
public interface UserService {
    List<UserModel> listar();
    UserModel listarId(Long id);

    
}
