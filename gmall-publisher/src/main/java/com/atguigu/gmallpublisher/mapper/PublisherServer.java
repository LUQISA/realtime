package com.atguigu.gmallpublisher.mapper;

import java.util.Map;

public interface PublisherServer {
    Long getDau(String date);

    Map<String,Long> getHourDau(String date);

    Double getTotalAmount(String date);
    Map<String,Double> getHourAmount(String date);
    /*
    总数
       聚合结果
        1.年龄
        2.性别
       详情
        ..
        Map(String date)
     */

  //  @Override
   // public  Map<String,Object> getSaleDetailAndAgg(String date, )




}
