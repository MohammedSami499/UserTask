package com.example.users.seviece.phoneNumbers;

import com.example.users.entity.PhoneNumbers;
import com.example.users.repository.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService{

    @Autowired
    PhoneNumberRepository phoneNumberRepository;
    @Override
    public PhoneNumbers addPhoneNumber(PhoneNumbers phone) {

        if(phone != null){
            return phoneNumberRepository.save(phone);
        }
        return null;
    }

    @Override
    public void deletePhoneNumber(Long id) {

        if(id != null){
             phoneNumberRepository.deleteById(id);
        }
    }



}
