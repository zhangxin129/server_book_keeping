package com.book.keeping.modular.provider;

import cn.stylefeng.roses.core.page.PageResult;
import com.book.keeping.api.model.IdReq;
import com.book.keeping.modular.controller.OrderTypeApi;
import com.book.keeping.modular.service.OrderTypeService;
import com.book.keeping.modular.entity.ordertype.*;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author zx
 * @since 2020-04-29
 */
@RestController
public class OrderTypeServiceProvider implements OrderTypeApi {

    @Autowired
    OrderTypeService service;

    @Override
    public ResponseData<List<OrderTypeResp>> getOrderTypeAll(OrderTypeQuery query) {

        return ResponseData.success(service.getOrderTypeAll(query));
    }

    @Override
    public ResponseData<PageResult<OrderTypeResp>> getOrderTypePage(OrderTypeQuery query) {

        return ResponseData.success(service.getOrderTypePage(query));
    }

    @Override
    public ResponseData<OrderTypeResp> getOrderTypeModel(IdReq req) {

        return ResponseData.success(service.getOrderTypeModel(req.getId()));
    }

    @Override
    public ResponseData<Boolean> addOrderType(AddOrderTypeReq req) {

        return ResponseData.success(service.addOrderType(req));
    }

    @Override
    public ResponseData<Boolean> updateOrderType(UpdateOrderTypeReq req) {

        return ResponseData.success(service.updateOrderType(req));
    }

    @Override
    public ResponseData<Boolean> delOrderType(IdReq req){

        return ResponseData.success(service.delOrderType(req.getId()));
    }
}

