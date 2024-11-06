public class Reloj {
   private Contador horas;
   private Contador min;
   private Contador seg;


    public Reloj(Contador h, Contador m, Contador s){
        this.horas=h;
        this.min=m;
        this.seg=s;
    }


    public Contador getHoras() {
        return horas;
    }


    public void setHoras(Contador horas) {
        this.horas = horas;
    }


    public Contador getSeg() {
        return seg;
    }


    public void setSeg(Contador seg) {
        this.seg = seg;
    }


    public Contador getMin() {
        return min;
    }


    public void setMin(Contador min) {
        this.min = min;
    }

    public void incrementarh(){
       
 
        if (this.seg.getNum()+1<60) {
            this.seg.incrementar();
         
        }
        else if (this.min.getNum()+1<60&&this.seg.getNum()+1>59) {
            this.seg.setNum(0);
            this.min.incrementar();
      
        }
        else if (this.horas.getNum()+1<24&&this.min.getNum()+1>59&&this.seg.getNum()+1>59){
            this.min.setNum(0);
            this.seg.setNum(0);
            this.horas.incrementar();
      
        }
        else{
            this.min.setNum(0);
            this.seg.setNum(0);
            this.horas.setNum(0);
          
        }
 
    
    }


    @Override
    public String toString() {
        return "Reloj [horas=" + horas + ", min=" + min + ", seg=" + seg + "]";
    }






   
    
}
