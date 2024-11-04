package clases.ejercicio5;

public class CuentaBancaria {
    
    /*
     * UNA CLASE ESTÁ COMPUESTA ATRIBUTOS Y MÉTODOS.
     * TODA CLASE TIENE CONSTRUCTOR, GET, SET Y TOSTRING.
     * ¿QUÉ HACE? ¿QUÉ RECIBE? ¿QUE DEVUELVE?
     * Los métodos modifican a sus atributios y los atributos son variables que tienen la clase
     * 
     * TIPO DE DATO PRIMITIVO = POR VALOR
     * TIPO DE DATO CLASE/OBJETO = POR REFERENCIA
     */
    
    //ATRIBUTOS
    private String numCuenta;
    private String nombreTitular;
    private double saldo;

    
    // CONSTRUCTOR POR DEFECTO
    public CuentaBancaria(){
        this.numCuenta="0000 0000 0000 0000";
        this.nombreTitular="";
        this.saldo=0;
    }

    //CONSTRUCTOR POR PARAMETROS 1
    
    public CuentaBancaria(String num, String nombre){
        this.numCuenta=num;
        this.nombreTitular=nombre;
        this.saldo=0;
    }

    //CONSTRUCTOR POR PARAMETROS 2
    public CuentaBancaria(String num, String nombre, double s){
        this.numCuenta=num;
        this.nombreTitular=nombre;
        this.saldo=s;
    }

    //CONSTRUCTOR DE COPIA
    public CuentaBancaria(CuentaBancaria copia){
        this.numCuenta = copia.numCuenta;
        this.nombreTitular = copia.nombreTitular;
        this.saldo = copia.saldo;

    }



    //METODOS = Función para trabajar con los atributos
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    //MÉTODO PERSONALIZADO
    public void sacar(double cant ){
        this.saldo = this.saldo - cant;
    }
    
    //MÉTODO PERSONALIZADO
    public void ingresar(double cant ){
        this.saldo = this.saldo + cant;
    }

    //MÉTODO PERSONALIZADO
    public boolean transferir(double cant, CuentaBancaria dest ){
        if(this.saldo>=cant){
            this.sacar(cant);
            dest.ingresar(cant);
            return true;
        }

        return false;
    }



    @Override
    public String toString() {
        return "CuentaBancaria [numCuenta=" + numCuenta + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
    }




   







}
