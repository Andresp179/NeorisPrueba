package com.example.controller;

import Dao.EncuestaDao;

public class Controlador {
	
	private EncuestaService encuestaService;

	@GetMapping("/")
    public String inicio(Model model){
    var encuesta=EncuestaService.listarEncuestas();
    model.addAttribute("encuesta", encuesta);

    return"";
  }



}
