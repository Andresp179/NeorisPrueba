package com.example.Domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Encuesta {
	

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idencuesta;
    private String email;
    private String comentarios;
    private String marcaPc;
    private Date fechaRespuesta;
	public Long getEncuesta() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
