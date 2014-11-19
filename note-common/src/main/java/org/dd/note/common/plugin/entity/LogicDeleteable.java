package org.dd.note.common.plugin.entity;

/**
 * <p>实体实现该接口表示想要逻辑删除
 * 为了简化开发 约定删除标识列名为deleted，如果想自定义删除的标识列名：
 * 1、使用注解元数据
 * 2、写一个 getColumn() 方法 返回列名
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午5:53:09
 * <p> @version 0.0.1
 */
public interface LogicDeleteable {

    public Boolean getDeleted();

    public void setDeleted(Boolean deleted);

    /**
     * 标识为已删除
     */
    public void markDeleted();

}
