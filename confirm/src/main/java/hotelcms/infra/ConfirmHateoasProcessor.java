package hotelcms.infra;

import hotelcms.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ConfirmHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Confirm>> {

    @Override
    public EntityModel<Confirm> process(EntityModel<Confirm> model) {
        return model;
    }
}
