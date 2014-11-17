package org.dd.note.common.repository;

import org.dd.note.common.entity.search.Searchable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 抽象DAO层基类 提供一些简便方法<br/>
 * 具体使用请参考测试用例：{@see UserRepository}
 * <p/>
 * 想要使用该接口需要在spring配置文件的jpa:repositories中添加 factory-class=
 * "com.sishuok.es.common.repository.support.SimpleBaseRepositoryFactoryBean"
 * <p/>
 * <p>
 * 泛型 ： M 表示实体类型；ID表示主键类型
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2014年11月17日 下午2:44:08
 * <p>
 * @version 0.0.1
 */
@NoRepositoryBean
public interface BaseRepository<M, ID extends Serializable> extends
		JpaRepository<M, ID> {

	/**
	 * 根据主键删除
	 *
	 * @param ids
	 */
	public void delete(ID[] ids);

	List<M> findAll();

	List<M> findAll(Sort sort);

	Page<M> findAll(Pageable pageable);

	/**
	 * 根据条件查询所有 条件 + 分页 + 排序
	 *
	 * @param searchable
	 * @return
	 */
	public Page<M> findAll(Searchable searchable);

	/**
	 * 根据条件统计所有记录数
	 *
	 * @param searchable
	 * @return
	 */
	public long count(Searchable searchable);

}
