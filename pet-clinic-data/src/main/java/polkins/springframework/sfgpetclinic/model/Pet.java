package polkins.springframework.sfgpetclinic.model;

import polkins.springframework.sfgpetclinic.BaseEntity;

public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private String birthday;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
