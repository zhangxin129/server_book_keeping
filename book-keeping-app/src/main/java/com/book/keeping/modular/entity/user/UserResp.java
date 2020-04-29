package com.book.keeping.modular.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liyi
 * @since 2020-04-29
 */
@Data
@ApiModel(value="UserResp对象", description="用户表")
public class UserResp implements Serializable {

    @ApiModelProperty(value = "主键ID" , example ="1")
    private Long userId;

    @ApiModelProperty(value = "账号" , example ="zhiling")
    private String username;

    @ApiModelProperty(value = "密码" , example ="zhiling")
    private String password;

    @ApiModelProperty(value = "密码盐" , example ="zhiling")
    private String salt;

    @ApiModelProperty(value = "手机号" , example ="zhiling")
    private String phone;

    @ApiModelProperty(value = "用户头像" , example ="zhiling")
    private String avatar;

    @ApiModelProperty(value = "创建时间" , example ="2019-8-22 19:19:19")
    private Date createTime;

    @ApiModelProperty(value = "修改时间" , example ="2019-8-22 19:19:19")
    private Date updateTime;

    @ApiModelProperty(value = "小程序openId" , example ="zhiling")
    private String miniOpenid;

    @ApiModelProperty(value = "邮箱" , example ="zhiling")
    private String email;


}
