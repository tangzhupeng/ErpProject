package cn.gson.jindie;

import cn.gson.jindie.model.mapper.salemapper.OrderMapper;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JindieApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {

        PageHelper.startPage(1,2);
        PageInfo<ErpOrder> orders = new PageInfo<>(orderMapper.findAllSaleOrder("%5%",null,null,1));
        System.out.println(orders.getList());

    }

}
