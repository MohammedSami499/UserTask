package com.example.users.repository;

import com.example.users.entity.PhoneNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberRepository extends JpaRepository<PhoneNumbers, Long> {


}
