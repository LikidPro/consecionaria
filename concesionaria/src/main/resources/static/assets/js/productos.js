
const { createApp } = Vue
createApp({
  data() {
    return {
        url:"/api/productos",
        arrayAutos:[],


        
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
            console.log(this.arrayAutos);
            
         })

    }
    
  },
  computed:{
    
    }
  
}).mount('#app')