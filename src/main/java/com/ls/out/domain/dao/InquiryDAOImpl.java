package com.ls.out.domain.dao;

import com.ls.out.domain.model.Admin;
import com.ls.out.domain.model.Inquiry;
import com.ls.out.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("inquiryDAO")
public class InquiryDAOImpl implements InquiryDAO {

    private final InquiryRepository inquiryRepository;

    @Autowired
    public InquiryDAOImpl(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }


    @Override
    public List<Inquiry> getAll() {
        return null;
    }

    @Override
    public Inquiry getDetail(Integer id) {
        return null;
    }

    @Override
    public boolean updateInquiry(Inquiry inquiry) {
        return false;
    }

    @Override
    public boolean sendInquiry(Integer id) {
        return false;
    }

    @Override
    public boolean checkLogin(Admin admin) {
        return false;
    }

    @Override
    public boolean createInquiry(Inquiry inquiry) {
        return false;
    }
}
