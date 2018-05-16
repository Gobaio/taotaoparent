package com.taotao.common.pojo;

import java.util.List;

public class EasyUIDataGridResult {
    private Long total; //查询出来的总记录数
    private List<?> rows;  //查询出的结果集

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
