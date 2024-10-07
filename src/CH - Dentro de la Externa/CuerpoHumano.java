public class CuerpoHumano {

    // Clase anidada Corazon
    public class Corazon {
        private int latidosPorMinuto;
        private String estadoSalud;
        private double presionSanguinea;

        public Corazon(int latidosPorMinuto, String estadoSalud, double presionSanguinea) {
            this.latidosPorMinuto = latidosPorMinuto;
            this.estadoSalud = estadoSalud;
            this.presionSanguinea = presionSanguinea;
        }

        public int getLatidosPorMinuto() {
            return latidosPorMinuto;
        }

        public void setLatidosPorMinuto(int latidosPorMinuto) {
            this.latidosPorMinuto = latidosPorMinuto;
        }

        public String getEstadoSalud() {
            return estadoSalud;
        }

        public void setEstadoSalud(String estadoSalud) {
            this.estadoSalud = estadoSalud;
        }

        public double getPresionSanguinea() {
            return presionSanguinea;
        }

        public void setPresionSanguinea(double presionSanguinea) {
            this.presionSanguinea = presionSanguinea;
        }
    }

    // Clase anidada Pulmon
    public class Pulmon {
        private int capacidadVital;
        private String estadoSalud;
        private int frecuenciaRespiratoria;

        public Pulmon(int capacidadVital, String estadoSalud, int frecuenciaRespiratoria) {
            this.capacidadVital = capacidadVital;
            this.estadoSalud = estadoSalud;
            this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        }

        public int getCapacidadVital() {
            return capacidadVital;
        }

        public void setCapacidadVital(int capacidadVital) {
            this.capacidadVital = capacidadVital;
        }

        public String getEstadoSalud() {
            return estadoSalud;
        }

        public void setEstadoSalud(String estadoSalud) {
            this.estadoSalud = estadoSalud;
        }

        public int getFrecuenciaRespiratoria() {
            return frecuenciaRespiratoria;
        }

        public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
            this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        }
    }

    // Atributos de las clases anidadas dentro de la clase externa
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;

    public CuerpoHumano() {
        // Inicializando los componentes desde el constructor de CuerpoHumano
        this.corazon = new Corazon(72, "Saludable", 120.0);
        this.pulmonIzquierdo = new Pulmon(3000, "Saludable", 16);
        this.pulmonDerecho = new Pulmon(2800, "Saludable", 16);
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public static void main(String[] args) {
        // Creando un objeto de la clase CuerpoHumano y accediendo a los atributos de los componentes
        CuerpoHumano cuerpo = new CuerpoHumano();

        // Manipulando los atributos del corazón y pulmones a través del objeto CuerpoHumano
        System.out.println("Latidos por minuto: " + cuerpo.getCorazon().getLatidosPorMinuto());
        System.out.println("Estado del corazón: " + cuerpo.getCorazon().getEstadoSalud());
        System.out.println("Capacidad pulmonar izquierda: " + cuerpo.getPulmonIzquierdo().getCapacidadVital());
        System.out.println("Capacidad pulmonar derecha: " + cuerpo.getPulmonDerecho().getCapacidadVital());
    }
}
