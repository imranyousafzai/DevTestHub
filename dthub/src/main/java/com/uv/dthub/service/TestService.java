package com.uv.dthub.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uv.dthub.model.Test;
import com.uv.dthub.repository.TestRepository;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public Test createTest(Test test) {
        return testRepository.save(test);
    }

    public List<Test> getTestsByGameId(ObjectId gameId) {
        return testRepository.findByGameId(gameId);
    }

    public List<Test> getTestsByTesterId(ObjectId testerId) {
        return testRepository.findByTesterId(testerId);
    }

    public Test updateTestStatus(ObjectId testId, String status) {
        Test test = testRepository.findById(testId).orElse(null);
        if (test != null) {
            test.setStatus(status);
            return testRepository.save(test);
        }
        return null;
    }
}

