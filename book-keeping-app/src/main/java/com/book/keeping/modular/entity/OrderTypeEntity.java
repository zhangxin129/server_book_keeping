package com.book.keeping.modular.entity;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement;
import com.alibaba.druid.sql.visitor.functions.If;
import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import jdk.nashorn.internal.ir.ContinueNode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author zx
 * @since 2020-04-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_type")
@ApiModel(value="OrderType", description="账单分类管理")
public class OrderTypeEntity implements Serializable {

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 类型名称
     */
    @TableField("type_name")
    private String typeName;

    /**
     * 0 支出 1 收入
     */
    @TableField("type")
    private String type;

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
     * 排序序列号
     */
    @TableField("sort")
    private Integer sort;


}
