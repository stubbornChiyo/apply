package com.claim.apply.entity.dto;

import lombok.Data;

/**
 * @author rui.chi
 * @version 1.0
 * @Description
 * @date 2021/12/29 14:13
 */
@Data
public class CoordinateSearchDTO {
    //统筹单id
    public String coordinateId;
    //page
    public long page;
    //size
    public long size;
}
