package org.dd.note.common.entity.search.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * 
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午3:13:58
 * <p> @version 0.0.1
 */
public class SearchException extends NestedRuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6626894688346988891L;

	public SearchException(String msg) {
        super(msg);
    }

    public SearchException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
