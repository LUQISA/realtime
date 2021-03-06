package com.atguigu.gmallpublisher.service;

import java.io.IOException;
import java.util.Map;

public interface PublisherService {
    Long getDau(String date);

    Map<String, Long> getHourDau(String date);


    Object getTotalAmount(String date);

    Map<String, Double> getHourAmount(String date);

    Map<String, Object> getSaleDetailAndAgg(String date,
                                            String keyword,
                                            int startpage,
                                            int size) throws IOException;
}
/*
List<Map<String, Long>
+----------+--------+
| LOGHOUR  | COUNT  |
+----------+--------+
| 14       | 25     |
| 15       | 53     |
+----------+--------+

得到这么个结果:
map("14": 20, "15": 30,...)


 */