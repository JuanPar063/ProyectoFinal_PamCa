
package Buscador_Ropa;

import java.util.ArrayList;
import java.util.List;


public class CarritoClass {
    private List<prenda> listaPrenda;

    public CarritoClass() {
        listaPrenda = new ArrayList<>();
    }

    public void agregarPrenda(prenda ropa) {
        listaPrenda.add(ropa);
    }

    public void removerPrenda(prenda ropa) {
        listaPrenda.remove(ropa);
    }

    public List<prenda> getListaPrenda() {
        return listaPrenda;
    }

    public int getCantidadPrenda() {
        return listaPrenda.size();
    }
}
