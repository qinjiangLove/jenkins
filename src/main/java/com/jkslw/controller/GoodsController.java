package com.jkslw.controller;

//import com.jkslw.model.Order;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jkslw.model.Goods;
import com.jkslw.service.GoodsService;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
        import java.util.List;
import java.util.Map;

@Controller
public class GoodsController {

//    @Autowired
//    private GoodsService goodsService;

    @RequestMapping
    @ResponseBody
    public String index(){

        return new StringBuilder("hello world!").toString();

    }


    @GetMapping("/index")
    @ResponseBody
    public String indexList(){
        return "index";
    }
//    @GetMapping("/index")
//    @ResponseBody
//    public List indexList(){
//        return goodsService.getGoodslIst();
//    }

//    public static TransportClient client() throws UnknownHostException {
//        Settings settings = Settings.builder()
//                .put("cluster.name","haxiha-es").build();
//        TransportClient client = new PreBuiltTransportClient(settings)
//                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("139.159.199.216"),8301));
//        return client;
//    }
//
//    @Value("${server.port}")
//    private String serverPort;
//
//    @RequestMapping("/goods")
//    public String goods(HttpServletRequest request){
//
//        List<Map> list = new ArrayList<>();
//
//        List<Map> goods = goodsService.getGoods();
//
//        for (int i=0;i<goods.size();i++){
//            Map gs = goods.get(i);
//
//            gs.put("is_new",1);
//
//            list.add(gs);
//        }
//        System.out.println(goods);
//        request.setAttribute("goods",list);
//        request.setAttribute("serverport",serverPort);
//
//     return "goods";
//    }
//
//
////返回json数据到页面
//    @ResponseBody
//    @RequestMapping("/goodsJson")
//    public String goodsJson(HttpServletRequest request){
//        JSONObject listJson=new JSONObject();
//        List<Map> object = new ArrayList<>();
//        List<Map> goods = goodsService.getGoods();
//
//        for (int i=0;i<goods.size();i++){
//            Map gsJson = goods.get(i);
//            gsJson.put("is_new",1);
//            object.add(gsJson);
//        }
//
//        listJson.put("objec",object);
//        listJson.put("time",System.currentTimeMillis()/1000);
//        listJson.put("code",200);
//        System.out.println(goods);
//        request.setAttribute("goods",listJson);
//        return listJson.toJSONString();
//    }
//
//
////编辑数剧处理
//    @GetMapping("/add/goods")
//    @ResponseBody
//    public String update(HttpServletRequest request) throws IOException {
//
//
//        List<Map<String,Object>> list=goodsService.getGoodslIst();
//        int x=0;
//        TransportClient client=client();
//        client.admin().indices().prepareCreate("goods");
//        for(int i=0;i<list.size();i++){
//            Map<String,Object> map=list.get(i);
//            XContentBuilder builder = XContentFactory.jsonBuilder().startObject();
//            for (Map.Entry<String, Object> entry : map.entrySet()){
//                builder.field(entry.getKey(),entry.getValue()==null?"":entry.getValue());
//            }
//            builder=builder.endObject();
//            IndexResponse response = client.prepareIndex("goods","goods_type",map.get("id").toString())
//                    .setSource(builder).get();
//            if(response!=null){
//                x++;
//            }
//        }
//
//        System.out.println("插入条数："+x);
//        client.close();
//        return "success";
//    }
//
//
//    @GetMapping("/add/group")
//    @ResponseBody
//    public String group(HttpServletRequest request) throws IOException {
//        List<Map<String,Object>> list=goodsService.getGoodsGroupList();
//        int x=0;
//        TransportClient client=client();
//        for(int i=0;i<list.size();i++){
//            Map<String,Object> map=list.get(i);
//            XContentBuilder builder = XContentFactory.jsonBuilder().startObject();
//            for (Map.Entry<String, Object> entry : map.entrySet()){
//                builder.field(entry.getKey(),entry.getValue()==null?"":entry.getValue());
//            }
//            builder=builder.endObject();
//            IndexResponse response = client.prepareIndex("group_index","group_type",map.get("id").toString())
//                    .setSource(builder).get();
//            if(response!=null){
//                x++;
//            }
//        }
//
//        System.out.println("插入条数："+x);
//        client.close();
//        return "success";
//    }
//
//    @GetMapping("/add/ad")
//    @ResponseBody
//    public String ad(HttpServletRequest request) throws IOException {
//
//
//        TransportClient client=client();
//        List<Map<String,Object>> list=goodsService.getGoodsAdlIst();
//        int x=0;
//        for(int i=0;i<list.size();i++){
//            Map<String,Object> map=list.get(i);
//            XContentBuilder builder = XContentFactory.jsonBuilder().startObject();
//            for (Map.Entry<String, Object> entry : map.entrySet()){
//                builder.field(entry.getKey(),entry.getValue()==null?"":entry.getValue());
//            }
//            builder=builder.endObject();
//            IndexResponse response = client.prepareIndex("ad","ad_type",map.get("id").toString())
//                    .setSource(builder).get();
//            if(response!=null){
//                x++;
//            }
//        }
//        System.out.println("插入条数："+x);
//        client.close();
//        return "success";
//    }

    //查找


}
