package vehiculos;

public class Pais {
  String nombre;

  public Pais(){
    this("");
  }

  public Pais(String nombre){
    this.nombre = nombre;
  }

  public static Pais paisMasVendedor() {
    Pais paisMaxVentas = null;
    int maxVentas = 0;

    for (Vehiculo v1 : Vehiculo.listado) {
        Pais paisActual = v1.getFabricante().getPais();
        int contador = 0;

        for (Vehiculo v2 : Vehiculo.listado) {
            if (v2.getFabricante().getPais().equals(paisActual)) {
                contador++;
            }
        }

        if (contador > maxVentas) {
            maxVentas = contador;
            paisMaxVentas = paisActual;
        }
    }

    return paisMaxVentas;
}

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

}
