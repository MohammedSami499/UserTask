package com.example.users.seviece.phoneNumbers;

import com.example.users.entity.PhoneNumbers;
import org.springframework.stereotype.Service;

@Service
public interface PhoneNumberService {
    PhoneNumbers addPhoneNumber(PhoneNumbers phone);

    void deletePhoneNumber(Long id);

}
