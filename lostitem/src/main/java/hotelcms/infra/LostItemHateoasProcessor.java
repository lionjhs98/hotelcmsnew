package hotelcms.infra;

import hotelcms.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class LostItemHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LostItem>> {

    @Override
    public EntityModel<LostItem> process(EntityModel<LostItem> model) {
        return model;
    }
}
