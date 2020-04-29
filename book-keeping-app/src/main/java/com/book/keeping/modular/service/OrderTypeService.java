package com.book.keeping.modular.service;

import com.book.keeping.modular.entity.OrderTypeEntity;
import com.book.keeping.modular.mapper.OrderTypeMapper;
import com.book.keeping.modular.entity.ordertype.*;
import cn.hutool.core.bean.BeanUtil;
import cn.stylefeng.roses.core.page.PageFactory;
import cn.stylefeng.roses.core.page.PageResult;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import cn.stylefeng.roses.core.util.ToolUtil;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.List;
import cn.stylefeng.roses.kernel.model.exception.RequestEmptyException;
import cn.stylefeng.roses.kernel.model.exception.ServiceException;

/**
 * @author zx
 * @since 2020-04-29
 */
@Service
public class OrderTypeService extends ServiceImpl<OrderTypeMapper, OrderTypeEntity> {

    public List<OrderTypeResp> getOrderTypeAll(OrderTypeQuery query) {
        List<OrderTypeEntity> list = this.list(query.buildWrapper(OrderTypeEntity.class));
        return list.stream().map(x ->
            BeanUtil.toBean(x, OrderTypeResp.class)
        ).collect(Collectors.toList());
    }

    public PageResult<OrderTypeResp> getOrderTypePage(OrderTypeQuery query) {
        IPage<OrderTypeEntity> page = PageFactory.createPage(query);
        this.page(page, query.buildWrapper(OrderTypeEntity.class));
        List<OrderTypeResp> list = page.getRecords().stream().map(x ->
                BeanUtil.toBean(x, OrderTypeResp.class)
        ).collect(Collectors.toList());
        PageResult<OrderTypeResp> pageResult = new PageResult<>(list, page.getCurrent(), page.getSize(), page.getTotal(), page.getPages());
        return pageResult;
    }

    public OrderTypeResp getOrderTypeModel(Long id) {
        OrderTypeEntity mEntity = this.getById(id);
        if (mEntity == null) {
            throw new ServiceException(8888,"未查询到订单信息");
        }
        OrderTypeResp mBean = BeanUtil.toBean(mEntity, OrderTypeResp.class);
        return mBean;
     }

    public Boolean addOrderType(AddOrderTypeReq req) {
//        Date date = new Date();
//        req.setCreateTime(date);
//        req.setUpdateTime(date);
        if (!req.getType().equals("0") && !req.getType().equals("1")){
            throw new ServiceException(8889,"传入订单类型错误");
        }
        OrderTypeEntity mBean = BeanUtil.toBean(req, OrderTypeEntity.class);
        return this.save(mBean);
    }

    public Boolean updateOrderType(UpdateOrderTypeReq req) {
        OrderTypeEntity old = this.getById(req.getId());
//        Date date = new Date();
//        req.setUpdateTime(date);
        ToolUtil.copyProperties(req, old);
        return this.updateById(old);
    }

    public Boolean delOrderType(Long id){
        return this.removeById(id);
    }

}
