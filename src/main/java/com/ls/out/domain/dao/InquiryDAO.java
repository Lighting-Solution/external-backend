package com.ls.out.domain.dao;

import com.ls.out.domain.model.Admin;
import com.ls.out.domain.model.Inquiry;

import java.util.List;

public interface InquiryDAO {
    public List<Inquiry> getAll();
    public Inquiry getDetail(Integer id);
    public boolean updateInquiry(Inquiry inquiry);
    public boolean sendInquiry(Integer id);
    public boolean checkLogin(Admin admin);
    public boolean createInquiry(Inquiry inquiry);
}
