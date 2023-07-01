package Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

import com.example.Domain.Encuesta;

@Repository
public interface  EncuestaDao extends JpaRepository<Encuesta,Long> {


}
