
const { createApp } = Vue
createApp({
  data() {
    return {
        url:"/api/productos",
        arrayAutos:[],
        autoSeleccionado:"",
        colorSeleccionado:"",
        caracteristica:"interior",


        
    }  
  },
  created() {
    this.obtenerData(this.url)
 
  }, 
  methods: {
    obtenerData(url){
        axios.get(url)
         .then(response => {
            this.arrayAutos = response.data
            const querystring = location.search
            const params = new URLSearchParams(querystring)
            const id = params.get("id")
            this.autoSeleccionado = this.arrayAutos.find(auto => auto.id == id)
            this.colorSeleccionado =  this.autoSeleccionado.colorDeProductos.sort()[0].fotos[0]
            

            
            
         })

    },
    cambiarDeColor(color){
      let imagenDetalleGrande= document.getElementById("imagen-detalle-grande")
      imagenDetalleGrande.classList.add("imagenDetalleGrande")
      setTimeout(() => {
        imagenDetalleGrande.classList.remove("imagenDetalleGrande")

      
       
       
      },.1);
    
      this.colorSeleccionado = this.autoSeleccionado.colorDeProductos.find(colorP => colorP.color == color).fotos

    },
    cambiarCaracteristica(caracteristica){
      let botonInterior = document.getElementById('botonInterior')
      let botonExterior = document.getElementById('botonExterior')
      let botonTecnico= document.getElementById('botonTecnico')
      if(caracteristica == 'interior' ){
        botonInterior.classList.add("active")
        botonExterior.classList.remove("active")
        botonTecnico.classList.remove("active")
        this.caracteristica = caracteristica
      }
      if(caracteristica == 'exterior' ){
        botonInterior.classList.remove("active")
        botonExterior.classList.add("active")
        botonTecnico.classList.remove("active")
        this.caracteristica = caracteristica
      }
      if(caracteristica == 'tecnico' ){
        botonInterior.classList.remove("active")
        botonExterior.classList.remove("active")
        botonTecnico.classList.add("active")
        this.caracteristica = caracteristica
      }

    }
    
  },
  computed:{
    
    }
  
}).mount('#app')