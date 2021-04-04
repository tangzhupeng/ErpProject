package cn.gson.jindie;

import cn.gson.jindie.model.mapper.salemapper.OrderMapper;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
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

        List<ErpOrder> all = orderMapper.findAll();
        System.out.println(all);

    }

}
