package com.ls.out.service;

import com.ls.out.domain.dao.InquiryDAO;
import com.ls.out.domain.model.Inquiry;
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
        try {
            Inquiry inquiry = Inquiry.builder()
                    .companyName(inquiryDTO.getCompanyName())
                    .name(inquiryDTO.getName())
                    .tel(inquiryDTO.getTel())
                    .email(inquiryDTO.getEmail())
                    .message(inquiryDTO.getMessage())
                    .manager(inquiryDTO.getManager())
                    .inquiryState(inquiryDTO.getInquiryState())
                    .build();
            inquiryDAO.createInquiry(inquiry);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
