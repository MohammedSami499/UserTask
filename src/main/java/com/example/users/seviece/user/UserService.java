package com.example.users.seviece.user;

import com.example.users.entity.PhoneNumbers;
import com.example.users.entity.Roles;
import com.example.users.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public interface UserService {
     List<Users> getAllUser() ;

    Users addUser(Users user);

    Users updateUser(Users user);

    Users updateUserRole(Long userId, Set<Roles> role);

    Optional<Users> getUserById(Long id);

    Set<PhoneNumbers> getPhoneByUserId(Long id);
}
