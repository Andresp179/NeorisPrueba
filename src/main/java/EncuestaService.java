import java.util.List;

import com.example.Domain.Encuesta;

public interface EncuestaService {

	public List<Encuesta> listarEncuestas();

    public void guardar (Encuesta encuesta);

    public void eliminar (Encuesta encuesta);

    public Encuesta encontarEncuesta(Encuesta encuesta);
	
	
}
