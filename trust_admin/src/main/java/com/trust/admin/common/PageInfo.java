package com.trust.admin.common;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Author Yangcb
 * @Descrintion 分页信息表
 * @Date create 2017-11-30 8:58
 * @Version 1.0
 */

@SuppressWarnings({"rawtypes", "unchecked"})
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //当前页
    private int pageNum = 1;
    //每页的数量
    private int pageSize = 10;
    //总记录数
    private long totalNum;
    // 总页数
    private int totalPage;
    //结果集
    private List<T> items;
    // 是否有下一页
    private boolean isMore =false;
    //是否为第一页
    private boolean isFirstPage = false;

    //是否为最后一页
    private boolean isLastPage = false;


    public PageInfo() {
    }

    /**
     * 包装Page对象
     *
     * @param list
     */
    public PageInfo(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.totalPage = page.getPages();
            this.items = page;
            this.totalNum = page.getTotal();
            this.isMore = this.pageNum >= this.totalPage?false:true;
        } else if (list instanceof Collection
                ) {
            this.pageNum = 1;
            this.pageSize = list.size();

            this.totalPage = 1;
            this.items = list;
            this.totalNum = list.size();
        }
        if (list instanceof Collection) {
            //判断页面边界
            judgePageBoudary();
        }
    }

    /**
     * 判定页面边界
     */
    private void judgePageBoudary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == totalPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public boolean isIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public boolean isIsLastPage() {
        return isLastPage;
    }

    public void setIsLastPage(boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageInfo{");
        sb.append("pageNum=").append(pageNum);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", items=").append(items);
        sb.append(", isFirstPage=").append(isFirstPage);
        sb.append(", isLastPage=").append(isLastPage);
        sb.append(", isMore=").append(isMore);
        sb.append(", navigatepageNums=");
        sb.append('}');
        return sb.toString();
    }
}
