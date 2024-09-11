package hotelcms.domain;

import hotelcms.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "lostItems", path = "lostItems")
public interface LostItemRepository
    extends PagingAndSortingRepository<LostItem, Long> {}
