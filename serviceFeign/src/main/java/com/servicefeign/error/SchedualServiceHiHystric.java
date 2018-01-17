package com.servicefeign.error;

import com.servicefeign.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/1/17.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
