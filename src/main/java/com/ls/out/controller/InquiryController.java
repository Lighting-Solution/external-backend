package com.ls.out.controller;

import com.ls.out.dto.InquiryDTO;
import com.ls.out.dto.AdminDTO;
import com.ls.out.service.AdminServiceImpl;
import com.ls.out.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lighting_solutions/inquiry")
public class InquiryController {

    private final InquiryService inquiryService;
    private final AdminServiceImpl adminService;

    @Autowired
    public InquiryController(InquiryService inquiryService, AdminServiceImpl adminService) {
        this.inquiryService = inquiryService;
        this.adminService = adminService;
    }

    /**
     * @apiNote 관리자가 사용자 문의 목록 확인 ( 게시판 )
     * @return
     */
    @GetMapping("/list-inquiry")
    public List<InquiryDTO> getAll() {
        return null;
    }

    /**
     * @apiNote 관리자가 문의 상세정보 확인
     * @param id
     * @return
     */
    @GetMapping("/detail-inquiry")
    public InquiryDTO getDetail(Integer id) {
        return null;
    }

    /**
     * @apiNote 관리자가 문의 상태 업데이트
     * @param inquiryDTO
     * @return
     */
    @PutMapping("/inquiry")
    public boolean updateInquiry(InquiryDTO inquiryDTO) {
        return true;
    }

    /**
     * @apiNote 관리자가 문의 내용을 문서함으로 전송
     * @param id
     * @return
     */
    @PostMapping("/send")
    public boolean sendInquiry(Integer id) {
        return true;
    }

    /**
     * @apiNote 관리자 로그인 체크
     * @param adminDTO
     * @return
     */
    @PostMapping("/admin")
    public boolean checkLogin(AdminDTO adminDTO) {
        return adminService.checkLogin(adminDTO);
    }

    // ***************************************************************

    /**
     * @apiNote 고객 문의 생성
     * @param inquiryDTO
     * @return
     */
    @PostMapping("/inquiry")
    public boolean createInquiry(InquiryDTO inquiryDTO) {
        return true;
    }


}
