package com.claim.apply.controller;


import com.claim.apply.entity.dto.CoordinateDetailDTO;
import com.claim.apply.entity.dto.CoordinateSearchDTO;
import com.claim.apply.service.CoordinateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.claim.apply.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chirui
 * @since 2021-12-29
 */
@Controller
@RequestMapping("/coordinateInfo")
public class CoordinateInfoController extends BaseController {

    @Resource
    private CoordinateInfoService coordinateInfoService;


    @RequestMapping(value = "/add", method = {RequestMethod.POST}, produces = "application/json")
    public Object add(@RequestBody CoordinateDetailDTO coordinateDetailDTO, HttpServletRequest request) {

        coordinateInfoService.addCoordinate(coordinateDetailDTO);

        return null;
    }


    @RequestMapping(value = "/list", method = {RequestMethod.POST}, produces = "application/json")
    public Object list(@RequestBody CoordinateSearchDTO coordinateSearchDTO, HttpServletRequest request) {

        return coordinateInfoService.search(coordinateSearchDTO);
    }


    @RequestMapping(value = "/getDetail", method = {RequestMethod.POST}, produces = "application/json")
    public Object getDetail(@RequestBody CoordinateSearchDTO coordinateSearchDTO, HttpServletRequest request) {

        return coordinateInfoService.getDetail(coordinateSearchDTO);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.POST}, produces = "application/json")
    public Object delete(@RequestBody CoordinateSearchDTO coordinateSearchDTO, HttpServletRequest request) {
        return "123";
    }


}

