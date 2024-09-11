package hotelcms.infra;

import hotelcms.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CleanTaskHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CleanTask>> {

    @Override
    public EntityModel<CleanTask> process(EntityModel<CleanTask> model) {
        return model;
    }
}
