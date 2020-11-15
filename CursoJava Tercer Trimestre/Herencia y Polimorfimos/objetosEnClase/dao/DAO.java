package objetosEnClase.dao;

import java.util.List;

public interface DAO {
	public void agregar(Object obj);
	public void modifcar(Object obj);
	public void eliminar(Object obj);
	public List leer(Object obj);

}
