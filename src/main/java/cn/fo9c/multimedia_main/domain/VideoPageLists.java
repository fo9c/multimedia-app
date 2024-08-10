package cn.fo9c.multimedia_main.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VideoPageLists {
    private List<Video> List = new ArrayList<>();

    private int pageNum;
    private Integer page_size;
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
        this.pageNum = videopage.getPageNum();
        this.page_size = videopage.getPageSize();
        this.size = videopage.getSize();
        this.orderBy = videopage.getOrderBy();
        this.startRow = videopage.getStartRow();
        this.endRow = videopage.getEndRow();
        this.total = videopage.getTotal();
        this.pages = videopage.getPages();
        this.firstPage = videopage.getFirstPage();
        this.prePage = videopage.getPrePage();
        this.nextPage = videopage.getNextPage();
        this.lastPage = videopage.getLastPage();

        this.isfirstPage = videopage.isIsfirstpage();
        this.islastPage = videopage.isIslastpage();

        this.hasPreviousPage = videopage.isHaspreviouspage();
        this.hasNextPage = videopage.isHasnextpage();
        this.navigatePages = videopage.getNavigatePages();
        this.navigatepageNums = videopage.getNavigatepageNums();
    }

}
