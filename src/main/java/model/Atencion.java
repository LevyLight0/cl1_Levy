package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Tabla de atencion")
@Data
public class Atencion {
	    @Id
	    private int num_atencion;
	    private Date fecha;
	    private String nom_paciente;
	    private int cod_tipo;
	    

}
