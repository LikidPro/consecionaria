
const { createApp } = Vue
createApp({
  data() {
    return {
        url:"/api/productos",
        arrayAutos:[],
        autoSeleccionado:"",


        
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
            console.log(id);
            this.autoSeleccionado = this.arrayAutos.find(auto => auto.id == id)
            console.log(this.autoSeleccionado);

            
            
         })

    }
    
  },
  computed:{
    
    }
  
}).mount('#app')