package cn.fo9c.multimedia_main.controller;

import cn.fo9c.multimedia_main.domain.Videopage;
import cn.fo9c.multimedia_main.mapper.VideoMapper;
import cn.fo9c.multimedia_main.mapper.VideopageMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Resource
    VideoMapper videoMapper;

    @Resource
    VideopageMapper videopageMapper;

    @RequestMapping("/test")
    public void test() {
        Videopage videopage = videopageMapper.selectOne(null);
        System.out.println(videopage);
    }
}
