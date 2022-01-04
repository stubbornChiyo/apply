package com.claim.apply.entity;

import lombok.Data;

import java.util.List;

/**
 * @author rui.chi
 * @version 1.0
 * @Description
 * @date 2021/12/29 17:40
 */
@Data
public class Pager<T> {
    private long page;//分页起始页
    private long size;//每页记录数
    private List<T> rows;//返回的记录集合
    private long total;//总记录条数
}
