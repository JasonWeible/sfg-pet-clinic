package dev.weible.sfgpetclinic.model;

import java.time.LocalDate;

//  CLASS DEFINITION
public class Pet {
    //  PROPERTIES
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


    //  CONSTRUCTORS


    //  OTHER METHODS


    //  GETTERS AND SETTERS
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    //  EQUALS AND HASH OVERRIDES


    //  TO STRING OVERRIDES


}
