package vehiculos;

public class Camioneta extends Vehiculo{
  Boolean volco;
  static int cantidad;
  Camioneta(){
    this("",0,"",0,0,null,false);
  }

  Camioneta(String placa,int puertas, String nombre, float precio, float peso, Fabricante fabricante, Boolean volco){
    super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
    this.volco = volco;
    cantidad += 1;
  }
}
