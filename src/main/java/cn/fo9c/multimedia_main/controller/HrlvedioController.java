package cn.fo9c.multimedia_main.controller;

import cn.fo9c.multimedia_main.domain.Video;
import cn.fo9c.multimedia_main.domain.VideoPageLists;
import cn.fo9c.multimedia_main.domain.Videopage;
import cn.fo9c.multimedia_main.mapper.VideoMapper;
import cn.fo9c.multimedia_main.mapper.VideopageMapper;
import cn.fo9c.multimedia_main.utils.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hrlweibo/manage/hrlvedio")
public class HrlvedioController {

    @Resource
    private VideoMapper videoMapper;

    @Resource
    private VideopageMapper videoPageMapper;

    /**
     * 视频推荐列表
     * @return 推荐列表
     */
    @RequestMapping("/recommendlist.do")
    public ResponseResult hrlweibo() {

        System.out.println("recommendlist");
        Videopage videoPage = videoPageMapper.selectById(1);
        System.out.println(videoPage);
        System.out.println("-----------------");

        List<Video> videos = videoMapper.selectList(null);
        System.out.println(videos);
        System.out.println("-----------------");

        VideoPageLists videoPageLists = new VideoPageLists(videos, videoPage);
        System.out.println(videoPageLists);

        return ResponseResult.success(videoPageLists);
    }





}
