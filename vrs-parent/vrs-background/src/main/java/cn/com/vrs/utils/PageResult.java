package cn.com.vrs.utils;

import java.util.List;

/***
 * @Description 分页结果类
 * @Author zhangFengQin
 * @Date Created in 2020/7/1 0001 11:21
 * @Version V 0.0.1
 * @Modified By:  
 *
 **/
public class PageResult<T> {

    private Long total;//总记录数
    private List<T> rows;//记录

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult() {
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
