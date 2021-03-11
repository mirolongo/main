class Cat extends Animal{
    String typeOfCat;

    public Cat(String typeOfCat) {
        super(String name, int age);
        this.typeOfCat = typeOfCat;
    }

    public String getTypeOfCat() {
        return typeOfCat;
    }

    public void setTypeOfCat(String typeOfCat) {
        this.typeOfCat = typeOfCat;
    }
    public void String meow(){
        System.out.println("Miau, Miau");
    }
}