package by.bogdanova.L13_02_2025_2;


public abstract class Pet extends Animal {

    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public void play(){
        System.out.println(super.getName() + " играет с хозяином " + owner.getName()
                + " " + owner.getSurname());
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное, хозяин: " + owner.getName() +
                " " + owner.getSurname() + ")";
    }
}
