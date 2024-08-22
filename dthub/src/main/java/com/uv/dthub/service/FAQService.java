package com.uv.dthub.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uv.dthub.model.FAQ;
import com.uv.dthub.repository.FAQRepository;

@Service
public class FAQService {

    @Autowired
    private FAQRepository faqRepository;

    public FAQ createFAQ(FAQ faq) {
        return faqRepository.save(faq);
    }

    public List<FAQ> getAllFAQs() {
        return faqRepository.findAll();
    }

    public FAQ updateFAQ(ObjectId faqId, String question, String answer) {
        FAQ faq = faqRepository.findById(faqId).orElse(null);
        if (faq != null) {
            faq.setQuestion(question);
            faq.setAnswer(answer);
            return faqRepository.save(faq);
        }
        return null;
    }
}
