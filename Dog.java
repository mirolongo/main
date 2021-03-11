class Dog extends Animal{
    String typeOfDog;

    public Dog(String typeOfDog) {
        super(String name, int age);
        this.typeOfDog = typeOfDog;
    }

    public String getTypeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = typeOfDog;
    }

    public void String bark(){
        System.out.println("Wolf, Wolf");
    }
}