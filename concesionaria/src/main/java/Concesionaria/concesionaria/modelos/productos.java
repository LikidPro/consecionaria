package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;

    private String marca;
    private String modelo;
    private String tipoMotor;
    private String cilindrada;
    private int puertas;
    private int velocidades;
    private int airbags;
    private int año;
    private boolean camaraReversa;


}
