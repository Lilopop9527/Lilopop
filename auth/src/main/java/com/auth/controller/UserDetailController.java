package com.auth.controller;

import com.auth.pojo.vo.DetailVO;
import com.auth.service.UserDetailService;
import com.common.core.pojo.CommonData;
import com.common.interceptor.annotation.CheckRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Lilopop
 * @description:
 */
@RestController
@RequestMapping("/detail")
public class UserDetailController {
    @Autowired
    private UserDetailService detailService;

    @GetMapping("/get")
    @CheckRole
    public CommonData<DetailVO> getUserDetail(Long id){
        DetailVO vo = detailService.findDetailByUserId(id);
        return new CommonData<>(200,"success",vo);
    }
}
