package vehiculos;

import java.util.List;

public class Pais {
  String nombre;

  Pais(){
    this("");
  }

  Pais(String nombre){
    this.nombre = nombre;
  }

  public static String paisMasVendedor(List<Vehiculo> vehiculos) {
    String paisMaxVentas = "";
    int maxVentas = 0;

    for (Vehiculo v1 : vehiculos) {
        String paisActual = v1.getFabricante().getPais().getNombre();
        int contador = 0;

        for (Vehiculo v2 : vehiculos) {
            if (v2.getFabricante().getPais().getNombre().equals(paisActual)) {
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
