package tech.shunzi.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.Optional;

/**
 * Version:v1.0 (description:  self define repository to expose some methods )
 * Date:2018/2/26 0026  Time:23:56
 */
@NoRepositoryBean
public interface SelfDefineRepository<T, ID extends Serializable> extends Repository<T, ID> {

	Optional<T> findById(ID id);

	<S extends T> S save(S entity);
}
