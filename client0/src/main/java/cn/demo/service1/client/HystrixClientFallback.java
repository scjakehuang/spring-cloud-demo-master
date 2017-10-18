package cn.demo.service1.client;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/10/13.
 */
@Component
public class HystrixClientFallback implements Service0Client {

    @Override
    public String test() {
        return "HystrixClientFallback";
    }
}
