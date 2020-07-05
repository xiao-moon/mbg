package com.moon.model.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-06 00:01
 */
@Data
@AllArgsConstructor
@Component
public class BlogProperties {

    private final Integer showContentSize = 70;
}
