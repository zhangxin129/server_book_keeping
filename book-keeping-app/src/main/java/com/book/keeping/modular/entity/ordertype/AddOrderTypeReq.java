package com.book.keeping.modular.entity.ordertype;


import cn.stylefeng.roses.core.util.ToolUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import cn.stylefeng.roses.core.reqres.request.RequestData;
import lombok.Data;

/**
 * @author zx
 * @since 2020-04-29
 */
@Data
@ApiModel(value="新增OrderType对象", description="账单分类管理")
public class AddOrderTypeReq extends RequestData {

    @ApiModelProperty(value = "用户id" , example ="1")
    private Long userId;

    @ApiModelProperty(value = "图标" , example ="zhiling")
    private String icon;

    @ApiModelProperty(value = "类型名称" , example ="zhiling")
    private String typeName;

    @ApiModelProperty(value = "0 支出 1 收入" , example ="zhiling")
    private String type;

    @ApiModelProperty(value = "排序序列号" , example ="1")
    private Integer sort;

    private Date createTime;

    private Date updateTime;

    @Override
    public String checkParam() {
        String checkResult = "";
        if(ToolUtil.isEmpty(userId)){
            checkResult += "【用户ID不能为空】";
        }
        if(ToolUtil.isEmpty(typeName)){
            checkResult += "【类型名称不能为空】";
        }
        if(ToolUtil.isEmpty(sort)){
            checkResult += "【排序序列号不能为空】";
        }

        return checkResult;
    }

}
