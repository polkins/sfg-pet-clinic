package polkins.springframework.sfgpetclinic.map;

import polkins.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> {

    @Override
    Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    Owner save(Long aLong, Owner object) {
        return super.save(aLong, object);
    }

    @Override
    Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Owner object) {
        super.delete(object);
    }
}
