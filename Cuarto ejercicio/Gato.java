class Gato extends Animal{
    public Gato(){
        super.sonido = "Miau";
    }

    @Override
    public void hacersonido(){
        super.hacersonido();
        System.out.println("El gato maulla");
    }
}