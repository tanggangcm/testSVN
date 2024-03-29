package com.tg.domain;

import java.util.List;

/**
 * @Description: PageBean 分页对象
 * @Author: tanggang
 * @Date: 2020/6/3
 * @Version: 1.0
 */
public class PageBean<T> {
    private int totalCount; //总记录数

    private int totalPage;  //总页码

    private List<T> list;   //每页的数据

    private int currentPage;    //当前页码

    private int rows;   //每页显示记录数

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
