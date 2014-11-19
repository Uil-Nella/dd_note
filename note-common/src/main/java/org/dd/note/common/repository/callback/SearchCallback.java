package org.dd.note.common.repository.callback;


import javax.persistence.Query;

import org.dd.note.common.entity.search.Searchable;

/**
 * 
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午7:35:34
 * <p> @version 0.0.1
 */
public interface SearchCallback {

    public static final SearchCallback NONE = new NoneSearchCallback();
    public static final SearchCallback DEFAULT = new DefaultSearchCallback();


    /**
     * 动态拼HQL where、group by having
     *
     * @param ql
     * @param search
     */
    public void prepareQL(StringBuilder ql, Searchable search);

    public void prepareOrder(StringBuilder ql, Searchable search);

    /**
     * 根据search给query赋值及设置分页信息
     *
     * @param query
     * @param search
     */
    public void setValues(Query query, Searchable search);

    public void setPageable(Query query, Searchable search);

}
