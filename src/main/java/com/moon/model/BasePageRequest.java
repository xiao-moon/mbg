package com.moon.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author moon
 * @date 2023-09-22 14:48
 * @description
 */
@Getter
@Setter
public class BasePageRequest {

    private Integer pageNum = 1;
    private Integer pageSize = 20;

}
