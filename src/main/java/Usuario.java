import java.util.List;

public class Usuario {

  public void viajar(Direccion origen, Direccion destino, List<Usuario> cuidadores){
    cuidadores.forEach(c->c.notificar("Viaje disponible"));

  }

  public void notificar(String msg){
    System.out.println(msg);
  }

}
