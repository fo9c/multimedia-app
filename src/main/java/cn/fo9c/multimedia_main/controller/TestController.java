package cn.fo9c.multimedia_main.controller;

import cn.fo9c.multimedia_main.domain.Videopage;
import cn.fo9c.multimedia_main.mapper.VideoMapper;
import cn.fo9c.multimedia_main.mapper.VideopageMapper;
import cn.fo9c.multimedia_main.utils.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Resource
    VideopageMapper videopageMapper;

    @RequestMapping("/test")
    public ResponseResult<Videopage> test() {
        Videopage videopage = videopageMapper.selectOne(null);
        System.out.println(videopage);
        return ResponseResult.success(videopage);
    }
}
