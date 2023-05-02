package med.voll.api.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.Direccion;



@Table(name="pacientes")
@Entity(name="Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String email;
	private String telefono;
	private String documento;	
	@Embedded
	private Direccion direccion;
	
	
	
	public Paciente() {
		super();
	}



	public Paciente(DatosRegistroPaciente datosRegistroPaciente) {
		this.nombre = datosRegistroPaciente.nombre();
		this.email = datosRegistroPaciente.email();
		this.telefono = datosRegistroPaciente.telefono();
		this.documento = datosRegistroPaciente.documento();		
		this.direccion = new Direccion(datosRegistroPaciente.direccion());
	}

}
