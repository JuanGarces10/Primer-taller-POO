class Violin extends Instrumento implements  Afinable{
    
    @Override
    public void tocar(){
        System.out.println("Tocando");
    }

    public void afinar(){
        System.out.println("Afinando");
    }
}
