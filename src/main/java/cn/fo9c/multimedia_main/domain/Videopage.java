package cn.fo9c.multimedia_main.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Videopage {

    @TableId
    private Integer id;

    private int page_num;
    private int page_size;
    private int size;
    private String order_by;
    private int start_row;
    private int end_row;
    private int total;
    private int pages;

    private int first_page;
    private int pre_page;

    private int next_page;
    private int last_page;
    private boolean is_first_page;
    private boolean is_last_page;
    private boolean has_previous_page;
    private boolean has_next_page;
    private int navigatePages;
    private String navigatepage_nums;
}