package com.book.keeping.modular.entity.ordertype;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author zx
 * @since 2020-04-29
 */
@Data
@ApiModel(value="OrderTypeResp对象", description="账单分类管理")
public class OrderTypeResp implements Serializable {

    @ApiModelProperty(value = "主键ID" , example ="1")
    private Long id;

    @ApiModelProperty(value = "用户id" , example ="1")
    private Long userId;

    @ApiModelProperty(value = "图标" , example ="zhiling")
    private String icon;

    @ApiModelProperty(value = "类型名称" , example ="zhiling")
    private String typeName;

    @ApiModelProperty(value = "0 支出 1 收入" , example ="zhiling")
    private String type;

    @ApiModelProperty(value = "创建时间" , example ="2019-8-22 19:19:19")
    private Date createTime;

    @ApiModelProperty(value = "修改时间" , example ="2019-8-22 19:19:19")
    private Date updateTime;

    @ApiModelProperty(value = "排序序列号" , example ="1")
    private Integer sort;


}
