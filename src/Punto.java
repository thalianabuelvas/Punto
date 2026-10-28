public class Punto{
    private int x, y;
    /*public Punto(){
        this.x=0;
        this.y= 0;
    }*/

    public Punto(int x, int y){
        this.setX(x);
        this.setY(y);


    }
    public Punto (int xy){
        this(xy,xy);
    }
    public Punto(){
        this (0,0);
    }

    public double modulo() {
        
        // Se calcula el modulo del vector con x,y
        return (double) Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double fase() {
        double valor = 0;
        // Se calcula la fase del vector con x,y
        return valor;
    }
    // cambio de atributo 
    public void setX (int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }
    //get, retorno 
    public int getX(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    
    }

    

