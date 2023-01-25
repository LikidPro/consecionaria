package Concesionaria.concesionaria.DTO;

import Concesionaria.concesionaria.modelos.Exterior;
import Concesionaria.concesionaria.modelos.Interior;
import Concesionaria.concesionaria.modelos.Producto;
import Concesionaria.concesionaria.modelos.Técnico;
import Concesionaria.concesionaria.repositorios.ExteriorRepositorio;
import Concesionaria.concesionaria.repositorios.InteriorRepositorio;
import Concesionaria.concesionaria.repositorios.TécnicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class ProductoDTO {
    @Autowired
    private InteriorRepositorio interiorRepositorio;
    @Autowired
    private ExteriorRepositorio exteriorRepositorio;
    @Autowired
    private TécnicoRepositorio técnicoRepositorio;


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

    private List<String> fotos1 = new ArrayList<>();

    private List<String> fotos2 = new ArrayList<>();

    private List<String> fotos3 = new ArrayList<>();

    private List<String> fotos4 = new ArrayList<>();

    private InteriorDTO interior;

    private ExteriorDTO exterior;

    private TécnicoDTO técnico;

    public ProductoDTO(Producto producto) {
        this.id = producto.getId();
        this.marca = producto.getMarca();
        this.modelo = producto.getModelo();
        this.tipoMotor = producto.getTipoMotor();
        this.cilindrada = producto.getCilindrada();
        this.puertas = producto.getPuertas();
        this.velocidades = producto.getVelocidades();
        this.airbags = producto.getAirbags();
        this.año = producto.getAño();
        this.camaraReversa = producto.isCamaraReversa();
        this.fotos1 = producto.getFotos1();
        this.fotos2 = producto.getFotos2();
        this.fotos3 = producto.getFotos3();
        this.fotos4 = producto.getFotos4();
        this.interior = new InteriorDTO(producto.getInterior()) ;
        this.exterior = new ExteriorDTO(producto.getExterior()) ;
        this.técnico = new TécnicoDTO(producto.getTécnico());
    }

    public InteriorRepositorio getInteriorRepositorio() {
        return interiorRepositorio;
    }

    public ExteriorRepositorio getExteriorRepositorio() {
        return exteriorRepositorio;
    }

    public TécnicoRepositorio getTécnicoRepositorio() {
        return técnicoRepositorio;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public int getAirbags() {
        return airbags;
    }

    public int getAño() {
        return año;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public List<String> getFotos1() {
        return fotos1;
    }

    public List<String> getFotos2() {
        return fotos2;
    }

    public List<String> getFotos3() {
        return fotos3;
    }

    public List<String> getFotos4() {
        return fotos4;
    }

    public InteriorDTO getInterior() {
        return interior;
    }

    public ExteriorDTO getExterior() {
        return exterior;
    }

    public TécnicoDTO getTécnico() {
        return técnico;
    }
}
