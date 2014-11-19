
package org.dd.note.common.repository.support.annotation;

import java.lang.annotation.*;

/**
 * 开启查询缓存
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午4:30:10
 * <p> @version 0.0.1
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableQueryCache {

    boolean value() default true;

}
