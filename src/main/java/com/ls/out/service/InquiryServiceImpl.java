package com.ls.out.service;

import com.ls.out.domain.dao.InquiryDAO;
import com.ls.out.dto.AdminDTO;
import com.ls.out.dto.InquiryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("inquiryService")
public class InquiryServiceImpl implements InquiryService{

    private final InquiryDAO inquiryDAO;

    @Autowired
    public InquiryServiceImpl(InquiryDAO inquiryDAO) {
        this.inquiryDAO = inquiryDAO;
    }

    @Override
    public List<InquiryDTO> getAll() {
        return null;
    }

    @Override
    public InquiryDTO getDetail(Integer id) {
        return null;
    }

    @Override
    public boolean updateInquiry(InquiryDTO inquiryDTO) {
        return false;
    }

    @Override
    public boolean sendInquiry(Integer id) {
        return false;
    }

    @Override
    public boolean checkLogin(AdminDTO adminDTO) {
        return false;
    }

    @Override
    public boolean createInquiry(InquiryDTO inquiryDTO) {
        return false;
    }
}
