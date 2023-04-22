package EJ.FActura;

    public class Factura {
        private String nombre;
        private String cedula;
        private int numeroelementos;
        private double valorUnidad;
        private String elemento;
        private int numeroArticulo;

        public Factura(){
            this.nombre = nombre;
            this.cedula = cedula;
            this.numeroelementos = numeroelementos;
            valorUnidad = valorUnidad;
            this.elemento = elemento;
            this.numeroArticulo = numeroArticulo;
        }


        public Factura(String nombre, String cedula, int numeroElementos, double valorUnidad, String elemento, int numeroArticulo) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.numeroelementos =
                    numeroElementos;
            this.valorUnidad = valorUnidad;
            this.elemento = elemento;
            this.numeroArticulo = numeroArticulo;
        }

        public int getNumeroArticulo() {
            return this.numeroArticulo;
        }

        public void setNumeroArticulo(int numeroArticulo) {
            this.numeroArticulo = numeroArticulo;
        }

        public String getNombre() {
            return this.nombre;
        }

        public String getCedula() {
            return this.cedula;
        }

        public int getNumeroelementos() {
            return this.numeroelementos;
        }

        public double getValorUnidad() {
            return this.valorUnidad;
        }

        public String getElemento() {
            return this.elemento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public void setNumeroelementos(int numeroelementos) {

            if (numeroelementos <=0){
                numeroelementos =0;
            }
            this.numeroelementos = numeroelementos;
        }

        public void setValorUnidad(double valorUnidad) {

            if (valorUnidad<=0){
                valorUnidad=0;
                this.valorUnidad = valorUnidad;
            }else {
                this.valorUnidad = valorUnidad;
            }
        }

        public void setElemento(String elemento) {
            this.elemento = elemento;
        }

        public double calculoValorTotalPorPieza() {
            return (double)this.numeroelementos * this.valorUnidad;
        }
    }

