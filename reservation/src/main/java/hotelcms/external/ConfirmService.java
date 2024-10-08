package hotelcms.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "confirm", url = "${api.url.confirm}")
public interface ConfirmService {
    @RequestMapping(method = RequestMethod.POST, path = "/confirms")
    public void approveConfirm(@RequestBody Confirm confirm);
}
