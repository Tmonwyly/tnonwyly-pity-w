package com.qianfeng;

import com.qianfeng.qunar.hotel.HotelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dubbo.xml")
public class DubooTest {
    @Autowired
    private HotelService hotelService;
        @Test
    public void testCase1(){
        hotelService.orderHotel();
    }
}
