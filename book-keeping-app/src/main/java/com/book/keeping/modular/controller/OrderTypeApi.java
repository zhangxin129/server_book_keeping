package com.book.keeping.modular.controller;

import cn.stylefeng.roses.core.page.PageResult;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import com.book.keeping.api.model.IdReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.book.keeping.modular.entity.ordertype.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zx
 * @since 2020-04-29
 */
@RequestMapping("/api/orderType")
@Api(tags = "账单分类管理相关接口")
public interface OrderTypeApi {

    @ApiOperation(value = "获取列表")
    @PostMapping("/getOrderTypeAll")
    ResponseData<List<OrderTypeResp>> getOrderTypeAll(@RequestBody OrderTypeQuery query);

    @ApiOperation(value = "分页获取列表")
    @PostMapping("/getOrderTypePage")
    ResponseData<PageResult<OrderTypeResp>> getOrderTypePage(@RequestBody OrderTypeQuery query);

    @ApiOperation(value = "获取Model对象")
    @PostMapping("/getOrderTypeModel")
    ResponseData<OrderTypeResp> getOrderTypeModel(@RequestBody IdReq req);

    @ApiOperation(value = "新增")
    @PostMapping("/addOrderType")
    ResponseData<Boolean> addOrderType(@RequestBody AddOrderTypeReq req);

    @ApiOperation(value = "更新")
    @PostMapping("/updateOrderType")
    ResponseData<Boolean> updateOrderType(@RequestBody UpdateOrderTypeReq req);

    @ApiOperation(value = "删除")
    @PostMapping("/delOrderType")
    ResponseData<Boolean> delOrderType(@RequestBody IdReq req);
}

