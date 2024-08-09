package cn.fo9c.multimedia_main.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VideoPageLists {
    private List<Video> List = new ArrayList<>();

    private int pageNum;
    private int pageSize;
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

    private boolean isfirstPage;
    private boolean islastPage;

    private boolean hasPreviousPage;
    private boolean hasNextPage;
    private int navigatePages;
    private String navigatepageNums;



    public VideoPageLists(List<Video> videos, Videopage videopage) {
        List.addAll(videos);
        this.pageNum = videopage.getPage_num();
        this.pageSize = videopage.getPage_size();
        this.size = videopage.getSize();
        this.orderBy = videopage.getOrder_by();
        this.startRow = videopage.getStart_row();
        this.endRow = videopage.getEnd_row();
        this.total = videopage.getTotal();
        this.pages = videopage.getPages();
        this.firstPage = videopage.getFirst_page();
        this.prePage = videopage.getPre_page();
        this.nextPage = videopage.getNext_page();
        this.lastPage = videopage.getLast_page();

        this.isfirstPage = videopage.is_first_page();
        this.islastPage = videopage.is_last_page();

        this.hasPreviousPage = videopage.isHas_previous_page();
        this.hasNextPage = videopage.isHas_next_page();
        this.navigatePages = videopage.getNavigatePages();
        this.navigatepageNums = videopage.getNavigatepage_nums();
    }
}
