package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
  static ArrayList<String> listado = new ArrayList<>();
  String nombre;
  Pais pais;
  Fabricante(){
    this("", null);
  }

  Fabricante(String nombre, Pais pais){
    this.nombre = nombre;
    this.pais = pais;
    listado.add(this.nombre);
  }

  public static String fabricaMayorVentas(List<Vehiculo> vehiculos) {
    String fabricaMaxVentas = "";
    int maxVentas = 0;

    for (Vehiculo v1 : vehiculos) {
        String fabricaActual = v1.getFabricante().getNombre();
        int contador = 0;

        for (Vehiculo v2 : vehiculos) {
            if (v2.getFabricante().getNombre().equals(fabricaActual)) {
                contador++;
            }
        }

        if (contador > maxVentas) {
            maxVentas = contador;
            fabricaMaxVentas = fabricaActual;
        }
    }

    return fabricaMaxVentas;
}


  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public Pais getPais(){
    return pais;
  }

  public void setPais(Pais pais){
    this.pais = pais;
  }
}
