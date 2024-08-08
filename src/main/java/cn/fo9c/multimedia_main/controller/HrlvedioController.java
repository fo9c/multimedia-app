package cn.fo9c.multimedia_main.controller;

import org.springframework.lang.NonNullApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hrlweibo/manage/hrlvedio")
public class HrlvedioController {

    /**
     * 视频推荐列表
     * @return 推荐列表
     */
    @RequestMapping("/recommendlist.do")
    public String hrlweibo() {
            System.out.println("hrlweibo");
            return "{\n" +
                    "    \"status\": 200,\n" +
                    "    \"data\": {\n" +
                    "        \"pageNum\": 1,\n" +
                    "        \"pageSize\": 10,\n" +
                    "        \"size\": 10,\n" +
                    "        \"orderBy\": null,\n" +
                    "        \"startRow\": 0,\n" +
                    "        \"endRow\": 9,\n" +
                    "        \"total\": 10,\n" +
                    "        \"pages\": 1,\n" +
                    "        \"list\": [\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"coverimg\": \"https://wx3.sinaimg.cn/crop.0.6.1920.1067/b5fde6c1gy1geafbh13xpj21hc0u0u0x.jpg\",\n" +
                    "                \"videotime\": 70,\n" +
                    "                \"playnum\": 102,\n" +
                    "                \"userid\": 16,\n" +
                    "                \"tag\": \"旅游 · 旅行攻略\",\n" +
                    "                \"recommengstr\": \"null\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"去非洲当酋长？闯入非洲草原嗜血的古老部落\",\n" +
                    "                \"createtime\": 1588296983000,\n" +
                    "                \"username\": \"疆客旅行\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/user_jklx.jpg\",\n" +
                    "                \"userisvertify\": 0,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 3476,\n" +
                    "                \"userdesc\": \"旅游博主 旅行视频自媒体\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 2,\n" +
                    "                \"coverimg\": \"https://wx4.sinaimg.cn/orj480/0071QmVuly1geak41e0n1j30u00gwx33.jpg\",\n" +
                    "                \"videotime\": 12,\n" +
                    "                \"playnum\": 2,\n" +
                    "                \"userid\": 11,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"美食日榜最高第22名\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"吃完会福气满满的水蜜桃福袋冰蛋糕\",\n" +
                    "                \"createtime\": 1588296985000,\n" +
                    "                \"username\": \"东京景色\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/gaoxiao.jpg\",\n" +
                    "                \"userisvertify\": 0,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 4,\n" +
                    "                \"userdesc\": \"我是测试号0011\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 3,\n" +
                    "                \"coverimg\": \"https://wx2.sinaimg.cn/crop.245.0.1429.795/6e9d132dgy1gdnrb3bihoj21hc0m3k60.jpg\",\n" +
                    "                \"videotime\": 21,\n" +
                    "                \"playnum\": 21,\n" +
                    "                \"userid\": 3,\n" +
                    "                \"tag\": \"影视 · 影视解说\",\n" +
                    "                \"recommengstr\": \"null\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"精灵大战矮人，不料旁边突然窜出一大波兽人《霍比特人3》\",\n" +
                    "                \"createtime\": 1588296990000,\n" +
                    "                \"username\": \"热热热\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker3051105291684548329.jpg\",\n" +
                    "                \"userisvertify\": 0,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 2410000,\n" +
                    "                \"userdesc\": \"让他天天嚷嚷兔兔兔兔热热\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 4,\n" +
                    "                \"coverimg\": \"https://wx3.sinaimg.cn/large/e9595b01gy1gdvimyjqcqj20sx0fo40g.jpg\",\n" +
                    "                \"videotime\": 12,\n" +
                    "                \"playnum\": 21,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"1万点赞\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"行驶在瑞士小镇格林德瓦，风景简直是美爆\",\n" +
                    "                \"createtime\": 1588297861000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 5,\n" +
                    "                \"coverimg\": \"https://wx4.sinaimg.cn/large/8f95af28ly1gdit5i490yj21hc0u0wh5.jpg\",\n" +
                    "                \"videotime\": 3142,\n" +
                    "                \"playnum\": 35,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"点赞飙升\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"影视剧中令人意难平的角色\",\n" +
                    "                \"createtime\": 1588297863000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 6,\n" +
                    "                \"coverimg\": \"https://wx2.sinaimg.cn/orj480/006OQjBRly1ge9uocjzuqj31hc0u04na.jpg\",\n" +
                    "                \"videotime\": 424,\n" +
                    "                \"playnum\": 53,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": \"影视 · 影视剪辑\",\n" +
                    "                \"recommengstr\": \"null\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"拳打洋人脚踢狱霸！这个年轻人为什么如此嚣张？\",\n" +
                    "                \"createtime\": 1588297865000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 7,\n" +
                    "                \"coverimg\": \"https://wx2.sinaimg.cn/crop.202.0.1941.1080/0074c4zdly1geaf8f9zwpj31t80u0b2a.jpg\",\n" +
                    "                \"videotime\": 53,\n" +
                    "                \"playnum\": 34,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"6千转发\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"每口都滑嫩嫩的《尖椒干豆腐》东北厨子教你，包汁芡\",\n" +
                    "                \"createtime\": 1588297867000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 8,\n" +
                    "                \"coverimg\": \"https://wx3.sinaimg.cn/crop.0.5.1744.969/007Kbox2gy1gdubgywyo8j31cg0r8arc.jpg\",\n" +
                    "                \"videotime\": 542,\n" +
                    "                \"playnum\": 645,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"null\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"营养丰富香酥可口的蔬菜饼，做法非常简单，连挑食的小朋友都爱吃\",\n" +
                    "                \"createtime\": 1588297869000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 9,\n" +
                    "                \"coverimg\": \"https://wx1.sinaimg.cn/large/7452d703ly1gdmiljueigj20ru0foq45.jpg\",\n" +
                    "                \"videotime\": 31,\n" +
                    "                \"playnum\": 4,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"陈乔恩\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"【陈乔恩 | 东方不败】东方不败的爱情悲歌\",\n" +
                    "                \"createtime\": 1588297873000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 10,\n" +
                    "                \"coverimg\": \"https://wx2.sinaimg.cn/crop.207.0.1499.834/006lIx7Lly1ge63kmf8wbj31fe0n67wi.jpg\",\n" +
                    "                \"videotime\": 42,\n" +
                    "                \"playnum\": 2,\n" +
                    "                \"userid\": 1,\n" +
                    "                \"tag\": null,\n" +
                    "                \"recommengstr\": \"张家辉\",\n" +
                    "                \"type\": 1,\n" +
                    "                \"introduce\": \"张家辉电影混剪，这么燃的节奏我要嗨起来了！\",\n" +
                    "                \"createtime\": 1588297877000,\n" +
                    "                \"username\": \"ggboy\",\n" +
                    "                \"userheadurl\": \"http://175.27.193.33:8080/hrlweibo/file/image_picker8110576180772826562.jpg\",\n" +
                    "                \"userisvertify\": 1,\n" +
                    "                \"zannum\": 0,\n" +
                    "                \"videourl\": \"null\",\n" +
                    "                \"userfancount\": 341,\n" +
                    "                \"userdesc\": \"嫁鸡随鸡上课\"\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"firstPage\": 1,\n" +
                    "        \"prePage\": 0,\n" +
                    "        \"nextPage\": 0,\n" +
                    "        \"lastPage\": 1,\n" +
                    "        \"isFirstPage\": true,\n" +
                    "        \"isLastPage\": true,\n" +
                    "        \"hasPreviousPage\": false,\n" +
                    "        \"hasNextPage\": false,\n" +
                    "        \"navigatePages\": 8,\n" +
                    "        \"navigatepageNums\": [\n" +
                    "            1\n" +
                    "        ]\n" +
                    "    }\n" +
                    "}";
        }





}
