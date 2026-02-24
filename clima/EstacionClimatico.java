public  class EstacionClimatico{

    private double[] temperaturas = new double[24];

    public EstacionClimatico(){
        for(int i = 0;i < temperaturas.length;i++){
            temperaturas[i] = Math.random()*40;
        }
    }
    public void mostrartemperaturasmediodida(){
        System.out.println("temperatura medio dia" + temperaturas[12] + "°C");
    }
    public void asignartemperaturainvalidada(){
        try {
            temperaturas[24] = Math.random()*40;
        } catch ( ArrayIndexOutOfBoundsException  e) {
            System.out.println("Error:no se puede ver tempertura en hora 24 por que esta fuera del rango del arreglo ");
            System.out.println("java solo tiene mem oria fija recuerda que el indice es de 0" + (temperaturas.length - 1));
        }
    }
   
}