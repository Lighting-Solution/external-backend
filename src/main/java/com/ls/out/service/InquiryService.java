package com.ls.out.service;

import com.ls.out.dto.AdminDTO;
import com.ls.out.dto.InquiryDTO;

import java.util.List;

public interface InquiryService {
    public List<InquiryDTO> getAll();
    public InquiryDTO getDetail(Integer id);
    public boolean updateInquiry(InquiryDTO inquiryDTO);
    public boolean sendInquiry(Integer id);
    public boolean checkLogin(AdminDTO adminDTO);
    public boolean createInquiry(InquiryDTO inquiryDTO);
}
