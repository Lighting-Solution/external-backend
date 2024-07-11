package com.ls.out.domain.dao;

import com.ls.out.domain.model.Admin;
import com.ls.out.domain.model.Inquiry;

import java.util.List;
import java.util.Optional;

public interface InquiryDAO {
    public List<Inquiry> getAll();
    public Inquiry findById(Integer id);
    public boolean save(Inquiry inquiry);
}
