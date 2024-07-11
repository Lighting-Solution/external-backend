package com.ls.out.domain.dao;

import com.ls.out.domain.model.Admin;
import com.ls.out.domain.model.Inquiry;
import com.ls.out.dto.InquiryDTO;
import com.ls.out.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("inquiryDAO")
public class InquiryDAOImpl implements InquiryDAO {

    private final InquiryRepository inquiryRepository;
    private final InquiryDTO inquiryDTO;

    @Autowired
    public InquiryDAOImpl(InquiryRepository inquiryRepository, InquiryDTO inquiryDTO) {
        this.inquiryRepository = inquiryRepository;
        this.inquiryDTO = inquiryDTO;
    }


    @Override
    public List<Inquiry> getAll() {
        return inquiryRepository.findAll();
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
        try{
            inquiryRepository.save(inquiry);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
