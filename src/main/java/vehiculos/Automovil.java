package vehiculos;

public class Automovil extends Vehiculo{
  int puestos;
  static int cantidad;
  Automovil(){
    this("","",0,0,null,0);
  }

  Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos){
    super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
    this.puestos = puestos;
    cantidad += 1;
  }
}
