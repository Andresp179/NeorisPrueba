import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Domain.Encuesta;

import Dao.EncuestaDao;

@Service
public class EncuestaServiceImpl implements EncuestaService {

	@Autowired
	private EncuestaDao encuestaDao;
	
	@Override
	public List<Encuesta> listarEncuestas() {
		return (List<Encuesta>) encuestaDao.findAll();
	}
	@Override
	public void guardar(Encuesta encuesta) {
		encuestaDao.save(encuesta);	
	}
	@Override
	public void eliminar(Encuesta encuesta) {
		encuestaDao.delete(encuesta);
	}

	@Override
	public Encuesta encontarEncuesta(Encuesta encuesta) {
	return encuestaDao.findById(encuesta.getEncuesta()).orElse(null);
	}

}
