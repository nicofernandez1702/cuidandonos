import Adapters.GpsAdapter;
import  java.util.List;

public class CalculadoraDemora {
  private GpsAdapter gps;


  public float calcularDemora(Direccion origen, List<Direccion> destino){
    float coefDemora = 3;//demora en minutos por km
    float distancia = gps.calcularDistancia(origen, destino.head());
    for (int i = 0; i < destino.size() - 1; i++) {
      int elemento1 = destino.get(i);
      int elemento2 = destino.get(i + 1);
      distancia += gps.calcularDistancia(elemento1, elemento2);
    }
    return distancia*coefDemora;
  }

}
