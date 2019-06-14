package com.example.experiment.service;

import com.example.experiment.entity.Exam;
import com.example.experiment.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;

@Service
@Transactional
public class AddExamService {
    @PersistenceContext
    private EntityManager em;
    UserService u;
    public void setExam(String name, String classRoom,int studentNum,
                        LocalDateTime startTime,
                        LocalDateTime endTime){

        Exam e1=new Exam(name,classRoom,
                studentNum, startTime, endTime);
        em.persist(e1);
    }
}
