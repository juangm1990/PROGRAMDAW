public class Contador {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Contador(int n){
        this.num=n;
    }


    //incrementar 
    public void incrementar(){
        this.num+=1;
    }

    //decrementar
    public void decrementar(){
        this.num-=1;
    }

    @Override
    public String toString() {
        return String.format("%02d", num) ;
    }
    
}
