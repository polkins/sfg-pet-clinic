package polkins.springframework.sfgpetclinic.map;

import polkins.springframework.sfgpetclinic.model.Owner;
import polkins.springframework.sfgpetclinic.services.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
