package vehiculos;

public class Fabricante {
  String nombre;
  Pais pais;
  public Fabricante(){
    this("", null);
  }

  public Fabricante(String nombre, Pais pais){
    this.nombre = nombre;
    this.pais = pais;
  }

  public static Fabricante fabricaMayorVentas() {
    Fabricante fabricaMaxVentas = null;
    int maxVentas = 0;

    for (Vehiculo v1 : Vehiculo.listado) {
        Fabricante fabricaActual = v1.getFabricante();
        int contador = 0;

        for (Vehiculo v2 : Vehiculo.listado) {
            if (v2.getFabricante().equals(fabricaActual)) {
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
