package Concesionaria.concesionaria.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Producto {
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
    private List<String> fotos1 = new ArrayList<>();

    private List<String> fotos2 = new ArrayList<>();
    private List<String> fotos3 = new ArrayList<>();
    private List<String> fotos4 = new ArrayList<>();


    @OneToOne(mappedBy = "producto", fetch = FetchType.EAGER)
    private Interior interior;
    @OneToOne(mappedBy = "producto", fetch = FetchType.EAGER)
    private Exterior exterior;
    @OneToOne(mappedBy = "producto", fetch = FetchType.EAGER)
    private Técnico técnico;


    public Producto() {
    }

    public Producto(String marca, String modelo, String tipoMotor, String cilindrada, int puertas, int velocidades, int airbags, int año, boolean camaraReversa) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.velocidades = velocidades;
        this.airbags = airbags;
        this.año = año;
        this.camaraReversa = camaraReversa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public List<String> getFotos1() {
        return fotos1;
    }

    public void setFotos1(List<String> fotos1) {
        this.fotos1 = fotos1;
    }

    public List<String> getFotos2() {
        return fotos2;
    }

    public void setFotos2(List<String> fotos2) {
        this.fotos2 = fotos2;
    }

    public List<String> getFotos3() {
        return fotos3;
    }

    public void setFotos3(List<String> fotos3) {
        this.fotos3 = fotos3;
    }

    public List<String> getFotos4() {
        return fotos4;
    }

    public void setFotos4(List<String> fotos4) {
        this.fotos4 = fotos4;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Exterior getExterior() {
        return exterior;
    }

    public void setExterior(Exterior exterior) {
        this.exterior = exterior;
    }

    public Técnico getTécnico() {
        return técnico;
    }

    public void setTécnico(Técnico técnico) {
        this.técnico = técnico;
    }
    public void añadirExterior(Exterior exterior){
        exterior.setProducto(this);
        this.exterior = exterior;
    }
    public void añadirInterior(Interior interior){
        interior.setProducto(this);
        this.interior = interior;
    }
    public void  añadirTécnico ( Técnico técnico){
        técnico.setProducto(this);
        this.técnico = técnico;
    }
}
