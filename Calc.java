package entities;


public class Calc{

    public Double width;
    public Double height;
    
    public Double area(){
        return this.width * this.height;
    }

    public Double perimeter(){
        return 2*(this.width + this.height);
    }

    public Double diagonal(){
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
    
}
