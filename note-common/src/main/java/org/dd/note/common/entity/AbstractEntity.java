package org.dd.note.common.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.domain.Persistable;
import java.io.Serializable;

/**
 * 抽象实体基类，如果主键是数据库端自动生成 请使用{@link BaseEntity}，如果是Oracle 请使用
 * {@link BaseOracleEntity}
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2014年11月17日 下午2:33:20
 * <p>
 * @version 0.0.1
 */
public abstract class AbstractEntity<ID extends Serializable> implements
		Persistable<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract ID getId();

	/**
	 * Sets the id of the entity.
	 *
	 * @param id
	 *            the id to set
	 */
	public abstract void setId(final ID id);

	public boolean isNew() {

		return null == getId();
	}

	@Override
	public boolean equals(Object obj) {

		if (null == obj) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!getClass().equals(obj.getClass())) {
			return false;
		}

		AbstractEntity<?> that = (AbstractEntity<?>) obj;

		return null == this.getId() ? false : this.getId().equals(that.getId());
	}

	@Override
	public int hashCode() {

		int hashCode = 17;

		hashCode += null == getId() ? 0 : getId().hashCode() * 31;

		return hashCode;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
