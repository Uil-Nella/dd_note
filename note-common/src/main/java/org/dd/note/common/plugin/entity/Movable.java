package org.dd.note.common.plugin.entity;

/**
 * <p>实体实现该接口表示想要调整数据的顺序
 * <p>优先级值越大则展示时顺序越靠前 比如 2 排在 1 前边
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午5:53:34
 * <p> @version 0.0.1
 */
public interface Movable {

    public Integer getWeight();

    public void setWeight(Integer weight);

}
