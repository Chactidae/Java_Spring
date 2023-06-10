package com.example.filmStudio.services;


import com.example.filmStudio.models.Account;
import com.example.filmStudio.models.Film_info;
import com.example.filmStudio.models.User_record;
import com.example.filmStudio.repositories.RecordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository recordRepository;

    public List<User_record> list() {
        return recordRepository.findAllRecords();
    }
    public User_record findById(Long id){
        return recordRepository.findById(id).orElse(null);
    }
    public void createRecord(User_record user_record){
        recordRepository.createRecord(user_record.getFio(), user_record.getEmail(), user_record.getBirthday(),
                user_record.getDelivery_address(), user_record.getPayment_address());
    }

}
