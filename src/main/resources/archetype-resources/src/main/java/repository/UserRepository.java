package ${package}.repository;

import ${package}.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    User findByEmail(String email);
}
