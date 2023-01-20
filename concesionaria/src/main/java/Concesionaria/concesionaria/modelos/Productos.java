package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Productos {
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

    @ElementCollection
    @Column (name = "links_fotos", length = 2000)
    @OneToOne(mappedBy = "color")
    private List<String> fotos1, fotos2, fotos3, fotos4;

    public Productos() {
    }
}
