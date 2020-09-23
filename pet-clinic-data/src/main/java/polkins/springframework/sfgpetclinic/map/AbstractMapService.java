package polkins.springframework.sfgpetclinic.map;

import polkins.springframework.sfgpetclinic.model.BaseEntity;
import polkins.springframework.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// временно выступает в роли бд
public abstract class AbstractMapService<T extends BaseEntity<ID>, ID> implements CrudService<T,ID> {

    protected Map<ID, T> map = new HashMap<>();

    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T object) {
        return map.put(object.getId(), object);
    }

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
