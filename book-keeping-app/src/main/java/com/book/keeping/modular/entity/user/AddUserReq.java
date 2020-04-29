package com.book.keeping.modular.entity.user;


import cn.stylefeng.roses.core.reqres.request.RequestData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jodd.util.StringUtil;
import lombok.Data;

/**
 * @author liyi
 * @since 2020-04-29
 */
@Data
@ApiModel(value="新增User对象", description="用户表")
public class AddUserReq extends RequestData {

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

    @ApiModelProperty(value = "小程序openId" , example ="zhiling")
    private String miniOpenid;

    @ApiModelProperty(value = "邮箱" , example ="zhiling")
    private String email;

    @Override
    public String checkParam() {
        if(StringUtil.isEmpty(email)){
            return "asd";
        }
        return null;
    }
}
