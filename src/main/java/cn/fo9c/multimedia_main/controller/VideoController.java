package cn.fo9c.multimedia_main.controller;

import cn.fo9c.multimedia_main.domain.Navigation;
import cn.fo9c.multimedia_main.domain.VideoPageLists;
import cn.fo9c.multimedia_main.mapper.NavigationMapper;
import cn.fo9c.multimedia_main.mapper.VideoMapper;
import cn.fo9c.multimedia_main.mapper.VideopageMapper;
import cn.fo9c.multimedia_main.utils.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hrlweibo/manage/hrlvedio")
public class VideoController {

    @Resource
    private VideoMapper videoMapper;

    @Resource
    private VideopageMapper videoPageMapper;

    @Resource
    private NavigationMapper navigationMapper;

    /**
     * 视频推荐列表
     * @return 推荐列表
     */
    @RequestMapping("/recommendlist.do")
    public ResponseResult<VideoPageLists> hrlweibo() {
        VideoPageLists videoPageLists = new VideoPageLists(videoMapper.selectList(null), videoPageMapper.selectById(1));
        System.out.println(videoPageLists);
        return ResponseResult.success(videoPageLists);
    }

    /**
     * 导航栏列表
     * @return 导航栏列表
     */
    @RequestMapping("/list.do")
    public ResponseResult<List<Navigation>> list() {
        List<Navigation> list = navigationMapper.selectList(null);
        return ResponseResult.success(list);
    }




}
