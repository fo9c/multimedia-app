package cn.fo9c.multimedia_main.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("videopage")
public class Videopage {

    @TableId
    private Integer id;

    private int pageNum;
    private Integer pageSize;
    private int size;
    private String orderBy;
    private int startRow;
    private int endRow;
    private int total;
    private int pages;

    private int firstPage;
    private int prePage;

    private int nextPage;
    private int lastPage;
    private boolean isfirstpage;
    private boolean islastpage;
    private boolean haspreviouspage;
    private boolean hasnextpage;
    private int navigatePages;
    private String navigatepageNums;
}