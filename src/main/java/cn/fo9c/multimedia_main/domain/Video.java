package cn.fo9c.multimedia_main.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {

    @TableId
    private Long id;

    private String coverimg;
    private int videotime;
    private int playnum;
    private Long userid;
    private String tag;
    private String recommengstr;
    private int type;
    private String introduce;
    private int createtime;
    private String username;
    private String userheadurl;
    private boolean userisvertify;
    private int zannum;
    private String videourl;
    private int userfancount;
    private String userdesc;
}