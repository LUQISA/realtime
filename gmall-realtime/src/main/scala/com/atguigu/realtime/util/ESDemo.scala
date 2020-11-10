package com.atguigu.realtime.util
//
//import io.searchbox.client.config.HttpClientConfig
//import io.searchbox.client.{JestClient, JestClientFactory}
//import io.searchbox.core.Index
//import org.apache.hadoop.hbase.Size
//
///*
// *Author liu
// * date 2020/8/22 14.00
// */
//object ESDemo {
//  def main(args: Array[String]): Unit = {
//    //先得到es的客户端
//    val factory: JestClientFactory = new JestClientFactory
//    val esUrl: String = "http://hadoop202:9200"
//    val config: HttpClientConfig = new HttpClientConfig.Builder(esUrl)
//      .maxTotalConnection(100)
//      .connTimeout(1000*10)
//      .readTimeout(1000*10)
//      .build()
//    factory.setHttpClientConfig(config)
//
//    val client: JestClient = factory.getObject
//
//    //操作es
//    //1.插入数据
////    val source:String=
////      """
////        |{
////        |"name" :"zs",
////        |"age"  :20
////        |
////        |}
////        |
////        |
////      """.stripMargin
//
//    val source: User = User("ww",15)
//    val index: Index = new Index.Builder(source)
//      .index("user")
//      .`type` ("_doc")
//      .id("2")
//      .build()
//    client.execute(index)
//    //2.查询
//    //关闭客户端
//    client.shutdownClient()
//
//  }
//
//
//  def insertSingle(index:String,source:Object,id:String=null):Unit={
//    val client: JestClient = factory.getObject
//
//    new Index.Builder(source)
//      .index(index)
//      .`type`("_doc")
//      .id(id)
//      .build()
//
//
//  }
//
//
//}
//
//case class User(name:String,age:Int)
//
///*
//source
//  1.json 格式
//  2.
// */
//
