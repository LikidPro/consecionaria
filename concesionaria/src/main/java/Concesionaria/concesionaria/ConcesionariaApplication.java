package Concesionaria.concesionaria;

import Concesionaria.concesionaria.modelos.EstadoDeUsado;
import Concesionaria.concesionaria.modelos.ProductoUsado;
import Concesionaria.concesionaria.repositorios.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ConcesionariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcesionariaApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ColorDeProductoRepositorio colorDeProductoRepositorio, ExteriorRepositorio exteriorRepositorio, InteriorRepositorio interiorRepositorio, ProductosRepositorio productosRepositorio, ProductosUsadosRepositorio productosUsadosRepositorio, TécnicoRepositorio técnicoRepositorio){
		return args -> {
//      Creando productos usados
			ProductoUsado producto1 = new ProductoUsado("Ford","Ranger 3.2","CD 4X2 XLT TDCI","Rojo", 72000,2015, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/292-ranger3.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto2 = new ProductoUsado("Ford","KA 1.5","FREESTYLE SEL MT","Marron", 79000,2019, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/329-KA.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto3 = new ProductoUsado("Ford","MONDEO 2.0","TITANIUM GI AT","Plateado", 138000,2014, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/308-MONDEO.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto4 = new ProductoUsado("Ford","Ranger 3.2","CD 4X2 XLT TDCI","Plateado", 72000,2013, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/293-ranger4.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto5 = new ProductoUsado("Fiat","CRONOS 1.8","16V PRECISION","Negro", 1000,2022, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/305-CRONOS.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto6 = new ProductoUsado("Fiat","Palio","WEEKEND ADVENTURE","Gris", 100000,2016, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/313-palio.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto7 = new ProductoUsado("Ford","FOCUS III 2.0","TITANIUM MT","Blanco", 120000,2016, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/287-focus.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado producto8 = new ProductoUsado("Toyota","COROLLA 1.8","XEI MT","Blanco", 140000,2017, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/219-COROLLA.jpg")),EstadoDeUsado.EXELENTE);
			productosUsadosRepositorio.save(producto1);
			productosUsadosRepositorio.save(producto2);
			productosUsadosRepositorio.save(producto3);
			productosUsadosRepositorio.save(producto4);
			productosUsadosRepositorio.save(producto5);
			productosUsadosRepositorio.save(producto6);
			productosUsadosRepositorio.save(producto7);
			productosUsadosRepositorio.save(producto8);


		};
	}

}
