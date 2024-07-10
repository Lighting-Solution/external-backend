package com.ls.out.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InquiryDTO {
    private Integer id;
    private String companyName;
    private String name;
    private String tel;
    private String email;
    private String message;
    private String manager;
    private int inquiryState;
}
