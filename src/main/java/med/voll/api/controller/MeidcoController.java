package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DatosRegistroMedico;

@RestController
@RequestMapping("/medicos")
public class MeidcoController {
	
	@PostMapping
	public void registrarMedico(@RequestBody DatosRegistroMedico datosMedico) {
		System.out.println(datosMedico);
		
	}

}
