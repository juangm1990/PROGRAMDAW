    public class Futbolista extends Persona implements Deportista {

        private int dorsal;
        private String demarcacion;
        public Futbolista(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, String demarcacion, int dorsal) {
            super(id, nombre, apellidos, fechaNac, peso, altura);
            this.demarcacion = demarcacion;
            this.dorsal = dorsal;
        }
        @Override
        public void viajar() {
            System.out.println("viajar "+this);
        }
        public int getDorsal() {
            return dorsal;
        }
        public void setDorsal(int dorsal) {
            this.dorsal = dorsal;
        }
        public String getDemarcacion() {
            return demarcacion;
        }
        public void setDemarcacion(String demarcacion) {
            this.demarcacion = demarcacion;
        }
        @Override
        public void entrenar() {
            System.out.println("entrenando");
        }
        @Override
        public void jugarPartido() {
            System.out.println("jugando");
        }
        @Override
        public boolean tieneSobrepeso() {
            return (super.peso/(super.altura*super.altura)) >22;
        }
    }

