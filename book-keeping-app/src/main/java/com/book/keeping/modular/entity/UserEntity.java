package com.book.keeping.modular.entity;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement;
import com.alibaba.druid.sql.visitor.functions.If;
import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import jdk.nashorn.internal.ir.ContinueNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author liyi
 * @since 2020-04-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
@ApiModel(value="User", description="用户表")
public class UserEntity implements Serializable {

    /**
     * 主键ID
     */
    @TableId(value = "user_id")
    private Long userId;

    /**
     * 账号
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 密码盐
     */
    @TableField("salt")
    private String salt;

    /**
     * 手机号
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 创建时间
     */
     @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
     @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 小程序openId
     */
    @TableField("mini_openid")
    private String miniOpenid;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;


}
