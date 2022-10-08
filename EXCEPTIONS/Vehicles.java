public class Vehicles <T> {
    private T name;
    private T price;

  
    public void setname(T name){
        this.name = name;
    }
    public T getname(){
        return name;
    }

    public void setprice(T price){
        this.price = price;

    }
    public T getprice(){
        return price;
    }
    public Vehicles(T name, T price){
        this.name = name;
        this.price = price;

    }
    public Vehicles(){
        
    }

    
}