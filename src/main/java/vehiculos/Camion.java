package vehiculos;

public class Camion extends Vehiculo{
  int ejes;
  static int cantidad;

  Camion(){
    this("","",0,0,null,0);
  }
  Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes){
    super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
    this.ejes = ejes;
    cantidad += 1;
  }
}
