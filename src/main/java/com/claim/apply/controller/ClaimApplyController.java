package com.claim.apply.controller;


import com.claim.apply.entity.ClaimApply;
import com.claim.apply.entity.request.ResponseBean;
import com.claim.apply.service.ClaimApplyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * <p>
 * 报案信息表 前端控制器
 * </p>
 *
 * @author chirui
 * @since 2021-12-07
 */
@Controller
@RequestMapping("/claimApply")
public class ClaimApplyController extends BaseController {

    @Resource
    private ClaimApplyService claimApplyService;

    //新增
    @PostMapping("add")
    public ResponseBean<Integer> insert(@RequestBody ClaimApply claimApply){
        return new ResponseBean(claimApplyService.saveOrUpdate(claimApply));
    }
    //分页获取list - 支持搜索
}

