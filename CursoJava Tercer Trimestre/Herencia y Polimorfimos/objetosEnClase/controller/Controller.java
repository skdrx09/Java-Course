package objetosEnClase.controller;

import objetosEnClase.modelo.Figura;
import objetosEnClase.modelo.exception.FiguraException;

public interface Controller {
	public void addHandler(Figura fig) throws FiguraException;
	public void leerHandler(Figura fig) throws FiguraException;
	public void modifyHandler(Figura fig) throws FiguraException;
	public void remomveHandler(Figura fig) throws FiguraException;
}
