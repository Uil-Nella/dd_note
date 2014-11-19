package org.dd.note.common.entity.search.exception;
/**
 * 
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午3:18:03
 * <p> @version 0.0.1
 */
public final class InvalidSearchValueException extends SearchException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -388996621190321794L;

	public InvalidSearchValueException(String searchProperty, String entityProperty, Object value) {
        this(searchProperty, entityProperty, value, null);
    }

    public InvalidSearchValueException(String searchProperty, String entityProperty, Object value, Throwable cause) {
        super("Invalid Search Value, searchProperty [" + searchProperty + "], " +
                "entityProperty [" + entityProperty + "], value [" + value + "]", cause);
    }

}
