package hotelcms.domain;

import hotelcms.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "confirms", path = "confirms")
public interface ConfirmRepository
    extends PagingAndSortingRepository<Confirm, Long> {}
