public class Contrato {
    private int salario;
    private String jornada;
    private String clausula;

    //por defecto
    public Contrato(){
        this.salario=0;
        this.jornada="completa";
        this.clausula="";
    }
    //parametros
    public Contrato(int s, String j, String c){
        this();
        if (s>0&&j.equals("completo")&&j.equals("parcial")&&c.length()<500) {
            this.salario=s;
            this.jornada=j;
            this.clausula=c;
        }
        
          
      
   
      
    }
    //copia
    public Contrato(Contrato copia){
        this.salario=copia.salario;
        this.jornada=copia.jornada;
        this.clausula=copia.clausula;
    }

    
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        if (salario>0) {
            this.salario=salario;
        }
      
    }
    public String getJornada() {
        return jornada;
    }
    public void setJornada(String jornada) {
        if (jornada.equals("completo")&&jornada.equals("parcial")) {
            this.jornada=jornada;
        }
     
    }
    public String getClausula() {
        return clausula;
    }
    public void setClausula(String clausula) {
        if (clausula.length()<=500) {
            this.clausula=clausula;
        }
     
    }

  



    @Override
    public String toString() {
        return "Contrato [salario=" + salario + ", jornada=" + jornada + ", clausula=" + clausula + "]";
    }


    

}
