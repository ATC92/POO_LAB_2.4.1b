class CuerpoHumano {
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

    public static void main(String[] args) {
        // Creando un objeto de la clase externa CuerpoHumano
        CuerpoHumano cuerpo = new CuerpoHumano();

        // Creando objetos de las clases anidadas a partir del objeto de la clase externa
        Corazon corazon = cuerpo.new Corazon(72, "Saludable", 120.0);
        Pulmon pulmonIzquierdo = cuerpo.new Pulmon(3000, "Saludable", 16);
        Pulmon pulmonDerecho = cuerpo.new Pulmon(2800, "Saludable", 16);

        // Manipulando los atributos de los objetos anidados
        System.out.println("Latidos por minuto: " + corazon.getLatidosPorMinuto());
        System.out.println("Estado del corazón: " + corazon.getEstadoSalud());
        System.out.println("Capacidad pulmonar izquierda: " + pulmonIzquierdo.getCapacidadVital());
        System.out.println("Capacidad pulmonar derecha: " + pulmonDerecho.getCapacidadVital());
    }
}
