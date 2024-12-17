package vehiculos;

public class Automovil extends Vehiculo{
  int puestos;
  static int cantidad;
  public Automovil(){
    this("","",0,0,null,0);
  }

  public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos){
    super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
    this.puestos = puestos;
    cantidad += 1;
  }
}
