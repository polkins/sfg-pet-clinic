package polkins.springframework.sfgpetclinic.map;

import polkins.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> {

    @Override
    Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    Vet save(Long aLong, Vet object) {
        return super.save(aLong, object);
    }

    @Override
    Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Vet object) {
        super.delete(object);
    }
}
