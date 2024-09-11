package hotelcms.infra;

import hotelcms.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "cleanTaskManagements",
    path = "cleanTaskManagements"
)
public interface CleanTaskManagementRepository
    extends PagingAndSortingRepository<CleanTaskManagement, Long> {}
