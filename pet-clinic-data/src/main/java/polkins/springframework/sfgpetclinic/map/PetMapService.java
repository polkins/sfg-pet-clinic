package polkins.springframework.sfgpetclinic.map;

import polkins.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> {

    @Override
    Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    Pet save(Long aLong, Pet object) {
        return super.save(aLong, object);
    }

    @Override
    Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Pet object) {
        super.delete(object);
    }
}
