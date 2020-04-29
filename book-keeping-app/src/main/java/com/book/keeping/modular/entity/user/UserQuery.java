package com.book.keeping.modular.entity.user;

import cn.stylefeng.roses.core.page.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liyi
 * @since 2020-04-29
 */
@Data
@ApiModel(value="User查询对象", description="用户表")
public class UserQuery extends PageQuery {

    @ApiModelProperty(value = "主键ID" , example ="1")
    private Long eq_userId;

    @ApiModelProperty(value = "账号" , example ="zhiling")
    private String like_username;

    @ApiModelProperty(value = "密码" , example ="zhiling")
    private String like_password;

    @ApiModelProperty(value = "密码盐" , example ="zhiling")
    private String like_salt;

    @ApiModelProperty(value = "手机号" , example ="zhiling")
    private String like_phone;

    @ApiModelProperty(value = "用户头像" , example ="zhiling")
    private String like_avatar;

    @ApiModelProperty(value = "创建时间" , example ="2019-8-22 19:19:19")
    private Date like_createTime;

    @ApiModelProperty(value = "修改时间" , example ="2019-8-22 19:19:19")
    private Date like_updateTime;

    @ApiModelProperty(value = "小程序openId" , example ="zhiling")
    private String like_miniOpenid;

    @ApiModelProperty(value = "邮箱" , example ="zhiling")
    private String like_email;


}
