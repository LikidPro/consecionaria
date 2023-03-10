package Concesionaria.concesionaria;

import Concesionaria.concesionaria.modelos.*;
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
	public CommandLineRunner initData(ColorDeProductoRepositorio colorDeProductoRepositorio, ExteriorRepositorio exteriorRepositorio, InteriorRepositorio interiorRepositorio, ProductosRepositorio productosRepositorio, ProductosUsadosRepositorio productosUsadosRepositorio, T√©cnicoRepositorio t√©cnicoRepositorio){
		return args -> {
//      Creando productos usados
			ProductoUsado productoU1 = new ProductoUsado("Ford","Ranger 3.2","CD 4X2 XLT TDCI","Rojo", 72000,2015, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/292-ranger3.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU2 = new ProductoUsado("Ford","KA 1.5","FREESTYLE SEL MT","Marron", 79000,2019, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/329-KA.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU3 = new ProductoUsado("Ford","MONDEO 2.0","TITANIUM GI AT","Plateado", 138000,2014, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/308-MONDEO.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU4 = new ProductoUsado("Ford","Ranger 3.2","CD 4X2 XLT TDCI","Plateado", 72000,2013, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/293-ranger4.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU5 = new ProductoUsado("Fiat","CRONOS 1.8","16V PRECISION","Negro", 1000,2022, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/305-CRONOS.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU6 = new ProductoUsado("Fiat","Palio","WEEKEND ADVENTURE","Gris", 100000,2016, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/313-palio.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU7 = new ProductoUsado("Ford","FOCUS III 2.0","TITANIUM MT","Blanco", 120000,2016, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/287-focus.jpg")),EstadoDeUsado.EXELENTE);
			ProductoUsado productoU8 = new ProductoUsado("Toyota","COROLLA 1.8","XEI MT","Blanco", 140000,2017, new ArrayList<>(java.util.List.of("https://www.gruporobayna.com.ar/img/usados/info/219-COROLLA.jpg")),EstadoDeUsado.EXELENTE);
			productosUsadosRepositorio.save(productoU1);
			productosUsadosRepositorio.save(productoU2);
			productosUsadosRepositorio.save(productoU3);
			productosUsadosRepositorio.save(productoU4);
			productosUsadosRepositorio.save(productoU5);
			productosUsadosRepositorio.save(productoU6);
			productosUsadosRepositorio.save(productoU7);
			productosUsadosRepositorio.save(productoU8);
//			Creando Productos nuevos
			Producto producto = new Producto("Ford","Mondeo SEL","Nafta","4 en linea",5,6,4,2023,true,"https://ciroautomotores.com.ar/images/FORD-FOTOS/MONDEO/far-mondeo-2019-galeria-ext-overlay-5.jpg");
			Producto producto2 = new Producto("Ford","Territory SEL","Nafta","4",5,8,4,2023,true,"https://media.lacapital.com.ar/p/a2f67730d50b1789d54073bf4e2e57a1/adjuntos/204/imagenes/030/706/0030706375/territoryjpg.jpg");
			Producto producto3 = new Producto("Ford","Kuga Hibrida SE","Nafta","4 en linea",5,6,4,2023,true,"https://blog.karvi.com.ar/wp-content/uploads/2021/01/Kuga-Titanium.jpg");
			Producto producto4 = new Producto("Citroen","SUV C4 CACTUS","Nafta","3cm",5,5,4,2023,true,"https://i.imgur.com/Gi5JAXw.jpg");
			Producto producto5 = new Producto("Citroen","C3","Nafta","3cm",5,6,4,2023,true,"https://wallpapercave.com/wp/wp4246479.jpg");
			Producto producto6 = new Producto("Renault","LOGAN","Nafta","3cm",5,5,2,2023,true,"https://i0.wp.com/www.autodestaque.net.br/wp-content/uploads/2020/01/1-27-scaled.jpg?fit=2560%2C1707");
			Producto producto7 = new Producto("Renault","SANDERO","Nafta","4 en linea",5,5,2,2023,true,"https://pro2-bar-s3-cdn-cf.myportfolio.com/6c07a1f48d28722680da023616317203/1c193c7b5772668c9f46c88b5084f21721a412be1ccf247dfc3b68068b146a1e6fee77a8fcab8b15_rw_3840.jpg?h=09dacbe0dc5b8f85815dc03136e188db");
			Producto producto8 = new Producto("Renault","CAPTUR","Nafta","cm3",5,6,4,2023,true,"https://fotos.perfil.com/2019/07/04/trim/1280/720/nuevo-renault-captur-749518.jpg");
			productosRepositorio.save(producto);
			productosRepositorio.save(producto2);
			productosRepositorio.save(producto3);
			productosRepositorio.save(producto4);
			productosRepositorio.save(producto5);
			productosRepositorio.save(producto6);
			productosRepositorio.save(producto7);
			productosRepositorio.save(producto8);
//			Creando Exterior
			Exterior exterior= new Exterior("235/45 R18",true,true,true,0,0);
			Exterior exterior2= new Exterior("235/55R17",true,true,true,0,0);
			Exterior exterior3= new Exterior("225/65R17",true,true,true,0,0);
			Exterior exterior4= new Exterior("Aleaci√≥n Diamantadas",true,true,true,0,0);
			Exterior exterior5= new Exterior("Aleaci√≥n",true,true,true,0,0);
			Exterior exterior6= new Exterior("Llantas de acero de 15",true,true,true,0,0);
			Exterior exterior7= new Exterior("Llantas de acero de 15",true,true,true,0,0);
			Exterior exterior8= new Exterior("Llantas 17'' de aleaci√≥n diamantadas",true,true,true,0,0);
			producto.a√ĪadirExterior(exterior);
			producto2.a√ĪadirExterior(exterior2);
			producto3.a√ĪadirExterior(exterior3);
			producto4.a√ĪadirExterior(exterior4);
			producto5.a√ĪadirExterior(exterior5);
			producto6.a√ĪadirExterior(exterior6);
			producto7.a√ĪadirExterior(exterior7);
			producto8.a√ĪadirExterior(exterior8);
			exteriorRepositorio.save(exterior);
			exteriorRepositorio.save(exterior2);
			exteriorRepositorio.save(exterior3);
			exteriorRepositorio.save(exterior4);
			exteriorRepositorio.save(exterior5);
			exteriorRepositorio.save(exterior6);
			exteriorRepositorio.save(exterior7);
			exteriorRepositorio.save(exterior8);
//			Creando interior
			Interior interior = new Interior(TapizadoAsiento.CUERO,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://www.megautos.com/wp-content/uploads/2019/06/Nuevo-Mondeo-Vignale-Hibrido-interior.jpg")));
			Interior interior2 = new Interior(TapizadoAsiento.CUERO,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://www.ayalaautomotores.com.ar/wp-content/uploads/2021/01/1595957553764-1024x721.jpg")));
			Interior interior3 = new Interior(TapizadoAsiento.CUERO,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://www.ayalaautomotores.com.ar/wp-content/uploads/2021/04/kug_caratc2.jpg")));
			Interior interior4 = new Interior(TapizadoAsiento.TELA,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://citroengiamaargentina.com/repositorio-landings/imagenes/citroen/c4-cactus-04.jpg")));
			Interior interior5 = new Interior(TapizadoAsiento.TELA,true,true,true,true,true,true,true,new ArrayList<>(List.of("hhttps://citroengiamaargentina.com/repositorio-landings/imagenes/citroen/nuevo-c3-03.jpg")));
			Interior interior6 = new Interior(TapizadoAsiento.TELA,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://acnews.blob.core.windows.net/imgnews/paragraph/NPAZ_8a363571bbe04c099daddd83653629b6.webp")));
			Interior interior7 = new Interior(TapizadoAsiento.TELA,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://www.megautos.com/wp-content/uploads/2021/11/Renault-Sandero-S-Edition-interior.jpg")));
			Interior interior8 = new Interior(TapizadoAsiento.CUERO,true,true,true,true,true,true,true,new ArrayList<>(List.of("https://fotos.perfil.com/2021/07/05/renault-captur-2022-interior-1199736.jpg")));
			producto.a√ĪadirInterior(interior);
			producto2.a√ĪadirInterior(interior2);
			producto3.a√ĪadirInterior(interior3);
			producto4.a√ĪadirInterior(interior4);
			producto5.a√ĪadirInterior(interior5);
			producto6.a√ĪadirInterior(interior6);
			producto7.a√ĪadirInterior(interior7);
			producto8.a√ĪadirInterior(interior8);
			interiorRepositorio.save(interior);
			interiorRepositorio.save(interior2);
			interiorRepositorio.save(interior3);
			interiorRepositorio.save(interior4);
			interiorRepositorio.save(interior5);
			interiorRepositorio.save(interior6);
			interiorRepositorio.save(interior7);
			interiorRepositorio.save(interior8);
//          Creando Tecnico
			T√©cnico t√©cnico= new T√©cnico(5,62,"2.0L Ecoboost GTDI",1689,Tracci√≥n.DELANTERA,6,16);
			T√©cnico t√©cnico2= new T√©cnico(5,52,"1.5L GTDI",1689,Tracci√≥n.DELANTERA,8,16);
			T√©cnico t√©cnico3= new T√©cnico(5,53,"2.5L",1689,Tracci√≥n.DELANTERA,6,16);
			T√©cnico t√©cnico4= new T√©cnico(5,55,"152 / 4.250 ",1689,Tracci√≥n.DELANTERA,5,16);
			T√©cnico t√©cnico5= new T√©cnico(5,47,"115 / 3.750 ",1689,Tracci√≥n.DELANTERA,5,16);
			T√©cnico t√©cnico6= new T√©cnico(5,50,"H4M",1689,Tracci√≥n.DOBLE,5,16);
			T√©cnico t√©cnico7= new T√©cnico(5,50,"NEDC",1689,Tracci√≥n.DOBLE,5,16);
			T√©cnico t√©cnico8= new T√©cnico(5,50,"H4M 1.6",1689,Tracci√≥n.DELANTERA,5,16);
			producto.a√ĪadirT√©cnico(t√©cnico);
			producto2.a√ĪadirT√©cnico(t√©cnico2);
			producto3.a√ĪadirT√©cnico(t√©cnico3);
			producto4.a√ĪadirT√©cnico(t√©cnico4);
			producto5.a√ĪadirT√©cnico(t√©cnico5);
			producto6.a√ĪadirT√©cnico(t√©cnico6);
			producto7.a√ĪadirT√©cnico(t√©cnico7);
			producto8.a√ĪadirT√©cnico(t√©cnico8);
			t√©cnicoRepositorio.save(t√©cnico);
			t√©cnicoRepositorio.save(t√©cnico2);
			t√©cnicoRepositorio.save(t√©cnico3);
			t√©cnicoRepositorio.save(t√©cnico4);
			t√©cnicoRepositorio.save(t√©cnico5);
			t√©cnicoRepositorio.save(t√©cnico6);
			t√©cnicoRepositorio.save(t√©cnico7);
			t√©cnicoRepositorio.save(t√©cnico8);
//			Colores producto
			ColorDeProducto colorDeProducto = new ColorDeProducto("#171616",new ArrayList<>(List.of("https://i.imgur.com/UpkHDHB.png")));
			ColorDeProducto colorDeProducto2 = new ColorDeProducto("#f6f4f4",new ArrayList<>(List.of("https://i.imgur.com/cP8x70z.png")));
			ColorDeProducto colorDeProducto3 = new ColorDeProducto("#9a9a9a",new ArrayList<>(List.of("https://i.imgur.com/Hf7bdrJ.png")));
			producto.a√ĪadirColor(colorDeProducto);
			producto.a√ĪadirColor(colorDeProducto2);
			producto.a√ĪadirColor(colorDeProducto3);
//          Colores producto2
			ColorDeProducto colorDeProducto4 = new ColorDeProducto("#f6f4f4",new ArrayList<>(List.of("https://lirp.cdn-website.com/3d61df13/dms3rep/multi/opt/unnamed-1920w.png")));
			ColorDeProducto colorDeProducto5 = new ColorDeProducto("#523316",new ArrayList<>(List.of("https://irp-cdn.multiscreensite.com/eec27d45/dms3rep/multi/-Ford+Territory+SEL.webp")));
			producto2.a√ĪadirColor(colorDeProducto4);
			producto2.a√ĪadirColor(colorDeProducto5);
//			colores producto3
			ColorDeProducto colorDeProducto6 = new ColorDeProducto("#f6f4f4",new ArrayList<>(List.of("https://www.electrifying.com/files/Mn9iK-kcSlBTQuVF/Kuga900.png")));
			ColorDeProducto colorDeProducto7 = new ColorDeProducto("#12146b",new ArrayList<>(List.of("https://i.imgur.com/IXyHSvp.png")));
//			ColorDeProducto colorDeProducto8 = new ColorDeProducto("Negro",new ArrayList<>(List.of("https://www.ford.com.ar/content/dam/Ford/website-assets/latam/ar/nameplate/kuga-hibrido/2021/colorizer/negro-pantera/far-kuga-hib-colores-negro-pantera.jpg.dam.full.high.jpg/1637073340526.jpg")));
			producto3.a√ĪadirColor(colorDeProducto6);
			producto3.a√ĪadirColor(colorDeProducto7);
//			producto3.a√ĪadirColor(colorDeProducto8);
//			Colores producto4
			ColorDeProducto colorDeProducto9 = new ColorDeProducto("#f6f4f4",new ArrayList<>(List.of("https://i.imgur.com/ITQYjQn.png")));
			ColorDeProducto colorDeProducto10 = new ColorDeProducto("#9a9a9a",new ArrayList<>(List.of("https://i.imgur.com/KQ6AaH7.png")));
			producto4.a√ĪadirColor(colorDeProducto9);
			producto4.a√ĪadirColor(colorDeProducto10);
//			Colores producto5
			ColorDeProducto colorDeProducto11 = new ColorDeProducto("#f6f4f4",new ArrayList<>(List.of("https://i.imgur.com/lGw02nf.png")));
			ColorDeProducto colorDeProducto12 = new ColorDeProducto("#9a9a9a",new ArrayList<>(List.of("https://i.imgur.com/xD8vKCG.png")));
			producto5.a√ĪadirColor(colorDeProducto11);
			producto5.a√ĪadirColor(colorDeProducto12);
//          Colores producto6
			ColorDeProducto colorDeProducto13 = new ColorDeProducto("#f6f4f4",new ArrayList<>(List.of("https://i.imgur.com/auVkki9.png")));
			producto6.a√ĪadirColor(colorDeProducto13);
//			colores producto7
			ColorDeProducto colorDeProducto14 = new ColorDeProducto("#12146b",new ArrayList<>(List.of("https://i.imgur.com/mmsYh1g.png")));
			ColorDeProducto colorDeProducto15 = new ColorDeProducto("#a91717",new ArrayList<>(List.of("https://i.imgur.com/gbhdmY6.png")));
			producto7.a√ĪadirColor(colorDeProducto14);
			producto7.a√ĪadirColor(colorDeProducto15);
//			colores producto 8
			ColorDeProducto colorDeProducto16 = new ColorDeProducto("#ff6200",new ArrayList<>(List.of("https://i.imgur.com/NAFkBRC.png")));
			producto8.a√ĪadirColor(colorDeProducto16);
			colorDeProductoRepositorio.save(colorDeProducto);
			colorDeProductoRepositorio.save(colorDeProducto2);
			colorDeProductoRepositorio.save(colorDeProducto3);
			colorDeProductoRepositorio.save(colorDeProducto4);
			colorDeProductoRepositorio.save(colorDeProducto5);
			colorDeProductoRepositorio.save(colorDeProducto6);
			colorDeProductoRepositorio.save(colorDeProducto7);
//			colorDeProductoRepositorio.save(colorDeProducto8);
			colorDeProductoRepositorio.save(colorDeProducto9);
			colorDeProductoRepositorio.save(colorDeProducto10);
			colorDeProductoRepositorio.save(colorDeProducto11);
			colorDeProductoRepositorio.save(colorDeProducto12);
			colorDeProductoRepositorio.save(colorDeProducto13);
			colorDeProductoRepositorio.save(colorDeProducto14);
			colorDeProductoRepositorio.save(colorDeProducto15);
			colorDeProductoRepositorio.save(colorDeProducto16);
			productosRepositorio.save(producto);
			productosRepositorio.save(producto2);
			productosRepositorio.save(producto3);
			productosRepositorio.save(producto4);
			productosRepositorio.save(producto5);
			productosRepositorio.save(producto6);
			productosRepositorio.save(producto7);
			productosRepositorio.save(producto8);

















		};
	}

}
