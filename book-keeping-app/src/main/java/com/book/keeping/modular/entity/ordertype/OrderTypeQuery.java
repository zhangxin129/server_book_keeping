package com.book.keeping.modular.entity.ordertype;

import cn.stylefeng.roses.core.page.PageQuery;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zx
 * @since 2020-04-29
 */
@Data
@ApiModel(value="OrderType查询对象", description="账单分类管理")
public class OrderTypeQuery extends PageQuery {

    @ApiModelProperty(value = "主键ID" , example ="1")
    private Long eq_id;

    @ApiModelProperty(value = "用户id" , example ="1")
    private Long eq_userId;

    @ApiModelProperty(value = "图标" , example ="zhiling")
    private String like_icon;

    @ApiModelProperty(value = "类型名称" , example ="zhiling")
    private String like_typeName;

    @ApiModelProperty(value = "0 支出 1 收入" , example ="zhiling")
    private String like_type;

    @ApiModelProperty(value = "创建时间" , example ="2019-8-22 19:19:19")
    private Date like_createTime;

    @ApiModelProperty(value = "修改时间" , example ="2019-8-22 19:19:19")
    private Date like_updateTime;

    @ApiModelProperty(value = "排序序列号" , example ="1")
    private Integer eq_sort;


}
