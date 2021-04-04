package cn.gson.jindie.model.mapper.purchasemapper;

import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PurchaseMapper {
    public List<Map<String,Object>> findPOderList();
}
