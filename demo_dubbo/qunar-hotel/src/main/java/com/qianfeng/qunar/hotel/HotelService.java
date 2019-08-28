package com.qianfeng.qunar.hotel;

import com.qianfeng.qunar.face.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    @Autowired
    private IPayService iPayService;
    public void orderHotel(){
        boolean pay = iPayService.pay();
        System.out.println("支付结果：" + pay);
    }
}
