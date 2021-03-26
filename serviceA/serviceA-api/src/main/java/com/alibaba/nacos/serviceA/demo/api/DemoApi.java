package com.alibaba.nacos.serviceA.demo.api;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.Response;

import static com.alibaba.nacos.serviceA.ApiInfo.CURRENT_VERSION;
import static com.alibaba.nacos.serviceA.ApiInfo.TARGET_SERVICE_NAME;


/**
 * <p>
 * 商品信息 接口API
 * </p>
 *
 * @author wangwei
 * @since 2020-10-15
 */
@FeignClient(TARGET_SERVICE_NAME)
public interface DemoApi {

    /**
     * 内部访问-KID查询详情
     *
     * @param kid
     * @return
     */
    @GetMapping(CURRENT_VERSION + "/pv/serviceA/get")
    String detail(@RequestParam("kid") Long kid);

}
