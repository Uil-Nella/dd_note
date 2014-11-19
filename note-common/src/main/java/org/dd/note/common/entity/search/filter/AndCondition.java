package org.dd.note.common.entity.search.filter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * and 条件
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午3:19:02
 * <p> @version 0.0.1
 */
public class AndCondition implements SearchFilter {

    private List<SearchFilter> andFilters = Lists.newArrayList();

    AndCondition() {
    }

    public AndCondition add(SearchFilter filter) {
        this.andFilters.add(filter);
        return this;
    }

    public List<SearchFilter> getAndFilters() {
        return andFilters;
    }

    @Override
    public String toString() {
        return "AndCondition{" + andFilters + '}';
    }
}
