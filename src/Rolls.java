// to give the abstract method a ne implementation of the method there has to be inheritance
class Rolls extends Vehicle{
    public void color(){
        //here there is method overriding because  the method provides its own implementation of the the method in the superclass
        System.out.println("Rolls rocye  is black");


        // rolls has its  own implementation of the method
    }
    public void speed(){
        System.out.println("100km/hr");
    }
    
    
}