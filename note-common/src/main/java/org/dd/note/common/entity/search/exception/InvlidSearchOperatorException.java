package org.dd.note.common.entity.search.exception;

import org.dd.note.common.entity.search.SearchOperator;

/**
 * 
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午3:17:27
 * <p> @version 0.0.1
 */
public final class InvlidSearchOperatorException extends SearchException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4723847103786661855L;

	public InvlidSearchOperatorException(String searchProperty, String operatorStr) {
        this(searchProperty, operatorStr, null);
    }

    public InvlidSearchOperatorException(String searchProperty, String operatorStr, Throwable cause) {
        super("Invalid Search Operator searchProperty [" + searchProperty + "], " +
                "operator [" + operatorStr + "], must be one of " + SearchOperator.toStringAllOperator(), cause);
    }
}
