package com.example.users.seviece.user;

import com.example.users.entity.PhoneNumbers;
import com.example.users.entity.Roles;
import com.example.users.entity.Users;
import com.example.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users updateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users updateUserRole(Long userId, Set<Roles> role) {
        if(userId != null){
            Users user = userRepository.findById(userId).get();
            user.setRoles(role);

            return userRepository.save(user);
        }
        return null;

    }

    @Override
    public Optional<Users> getUserById(Long id) {
        if(id != null){
            return userRepository.findById(id);
        }
        return null;
    }

    @Override
    public Set<PhoneNumbers> getPhoneByUserId(Long id) {

        if(id != null){
            Optional<Users> user = userRepository.findById(id);
            return user.get().getPhoneNumbers();
        }

        return null;
    }


}
