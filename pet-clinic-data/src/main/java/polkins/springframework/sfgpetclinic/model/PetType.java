package polkins.springframework.sfgpetclinic.model;

import polkins.springframework.sfgpetclinic.BaseEntity;

public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 