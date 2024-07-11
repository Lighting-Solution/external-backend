package com.ls.out.service;

import com.ls.out.domain.dao.InquiryDAO;
import com.ls.out.domain.model.Inquiry;
import com.ls.out.dto.AdminDTO;
import com.ls.out.dto.InquiryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("inquiryService")
public class InquiryServiceImpl implements InquiryService{

    private final InquiryDAO inquiryDAO;

    @Autowired
    public InquiryServiceImpl(InquiryDAO inquiryDAO) {
        this.inquiryDAO = inquiryDAO;
    }

    @Override
    public List<InquiryDTO> getAll() {
        List<Inquiry> inquiryList = inquiryDAO.getAll();
        return inquiryList.stream()
                .map(inquiry -> {
                    InquiryDTO inquiryDTO = new InquiryDTO();
                    inquiryDTO.setId(inquiry.getId());
                    inquiryDTO.setCompanyName(inquiry.getCompanyName());
                    inquiryDTO.setName(inquiry.getName());
                    inquiryDTO.setTel(inquiry.getTel());
                    inquiryDTO.setEmail(inquiry.getEmail());
                    inquiryDTO.setMessage(inquiry.getMessage());
                    inquiryDTO.setManager(inquiry.getManager());
                    inquiryDTO.setInquiryState(inquiry.getInquiryState());
                    return inquiryDTO;

                }).collect(Collectors.toList());
    }

    @Override
    public InquiryDTO getDetail(Integer id) {
        Inquiry inquiry = inquiryDAO.getDetail(id);

        InquiryDTO inquiryDTO = new InquiryDTO();
        inquiryDTO.setId(inquiry.getId());
        inquiryDTO.setCompanyName(inquiry.getCompanyName());
        inquiryDTO.setName(inquiry.getName());
        inquiryDTO.setTel(inquiry.getTel());
        inquiryDTO.setEmail(inquiry.getEmail());
        inquiryDTO.setMessage(inquiry.getMessage());
        inquiryDTO.setInquiryState(inquiry.getInquiryState());
        inquiryDTO.setManager(inquiry.getManager());
        return inquiryDTO;
    }

    @Override
    public boolean updateInquiry(InquiryDTO inquiryDTO) {
        Inquiry inquiry = inquiryDAO.getDetail(inquiryDTO.getId());
        if (inquiry != null) {
            inquiry.setCompanyName(inquiryDTO.getCompanyName());
            inquiry.setName(inquiryDTO.getName());
            inquiry.setTel(inquiryDTO.getTel());
            inquiry.setEmail(inquiryDTO.getEmail());
            inquiry.setMessage(inquiryDTO.getMessage());
            inquiry.setInquiryState(inquiryDTO.getInquiryState());
            inquiry.setManager(inquiryDTO.getManager());
            return inquiryDAO.updateInquiry(inquiry);
        }
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
