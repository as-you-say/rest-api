package toy.hong.openapi.app.repositories;

import org.springframework.data.repository.CrudRepository;
import toy.hong.openapi.model.ApiUserRequestLog;

public interface ApiUserRequestLogRepository extends CrudRepository<ApiUserRequestLog, String> {

}
