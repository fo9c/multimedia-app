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
    private boolean is_first_page;
    private boolean is_last_page;
    private boolean hasPreviousPage;
    private boolean has_next_page;
    private int navigatePages;
    private String navigatepage_nums;
}