package org.dd.note.common.repository.support.annotation;

import java.lang.annotation.*;

import org.dd.note.common.repository.callback.SearchCallback;

/**
 * 覆盖默认的根据条件查询数据
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2014年11月17日 下午4:30:54
 * <p>
 * @version 0.0.1
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SearchableQuery {

	/**
	 * 覆盖默认的查询所有ql
	 *
	 * @return
	 */
	String findAllQuery() default "";

	/**
	 * 覆盖默认的统计所有ql
	 *
	 * @return
	 */
	String countAllQuery() default "";

	/**
	 * 给ql拼条件及赋值的回调类型
	 *
	 * @return com.sishuok.es.common.repository.callback.SearchCallback子类
	 */
	Class<? extends SearchCallback> callbackClass() default SearchCallback.class;

	QueryJoin[] joins() default {};

}
