/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: User
 * Author:   14172
 * Date:     2020/9/14 21:57
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjean.exercise.exercise01.shiro.entity;

import lombok.Data;

/**
 * @author 14172
 * @create 2020/9/14
 * @since 1.0.0
 */
@Data
public class User {

    private String salt;
    private String id;
    private String name;
    private String password;

}
