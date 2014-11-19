package org.dd.note.common.entity.search.exception;
/**
 * 
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午3:13:23
 * <p> @version 0.0.1
 */
public final class InvalidSearchPropertyException extends SearchException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3825114167613065424L;

	public InvalidSearchPropertyException(String searchProperty, String entityProperty) {
        this(searchProperty, entityProperty, null);
    }

    public InvalidSearchPropertyException(String searchProperty, String entityProperty, Throwable cause) {
        super("Invalid Search Property [" + searchProperty + "] Entity Property [" + entityProperty + "]", cause);
    }


}
