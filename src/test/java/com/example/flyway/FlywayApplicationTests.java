package com.example.flyway;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.PropertyPreFilters;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.example.flyway.bean.CustomerApplyProductRsp;
import com.example.flyway.bean.User;
import com.example.flyway.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FlywayApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
//        System.out.println(("----- selectAll method test ------"));
//        userMapper.insert(new User().setName("张三").setUserAge(3));
//        userMapper.insert(new User().setName("旺旺三").setUserAge(0));
//        userMapper.insert(new User().setName("小王").setUserAge(90));
//        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);
//        String a = new String("a");
//        String b = new String("a");
//        System.out.println(a == b);
        User user = new User();
        user.setId(1L);
        user.setName(null);
        user.setUserAge(3);

        String[] includeAttributes = {"saleUserName"};
        //创建PropertyPreFilters对象
        PropertyPreFilters propertyPreFilters = new PropertyPreFilters();
        PropertyPreFilters.MySimplePropertyPreFilter include = propertyPreFilters.addFilter();
        include.addIncludes(includeAttributes);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(user);
        String string = JSONObject.toJSONString(objects, include, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue);
//        System.out.println(string);
//, include, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue
        String sb ="[{'id':508,'flowType':1,'productId':69,'productCode':'001','companyCode':null,'productName':'兴全测试001号','productFullName':'兴全测试001号','customerId':1386,'customerName':'任新岗','customerType':1,'codeText':'签约完成','codeValue':2130,'signStatus':2,'checkType':1,'isNeedCheck':null,'createTime':1608013403000,'updateTime':1608015341000,'applyMoney':null,'tradeMoney':10000.0000,'bankName':'1','accountNumber':'111','accountName':'1','pageNum':null,'pageSize':null,'customerIdList':null,'authorityStatus':null,'specialCustSeeStatus':null,'sensitiveInfoVisible':true,'userId':null,'investorType':1,'riskType':4,'calmStartTime':null,'calmEndTime':null,'calmHour':0,'saleUserName':null}]";
        List<CustomerApplyProductRsp> customerApplyProductRsps = JSONObject.parseArray(sb, CustomerApplyProductRsp.class);

        String o = JSONObject.toJSONString(customerApplyProductRsps, include, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue);
        System.out.println(o);
    }

}
