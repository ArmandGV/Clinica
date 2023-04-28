package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
	
	private String calle;
	private String numero;
	private String complemento;
	private String distrito;
	private String ciudad;
	public Direccion(DatosDireccion datosDireccion) {
		super();
		this.calle = datosDireccion.calle();
		this.numero = datosDireccion.numero();
		this.complemento = datosDireccion.complemento();
		this.distrito = datosDireccion.distrito();
		this.ciudad = datosDireccion.ciudad();
	}
	
	

}
