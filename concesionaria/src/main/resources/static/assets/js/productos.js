
const { createApp } = Vue
createApp({
  data() {
    return {
        url:"/api/productosusados",
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
            
         })

    }
    
  },
  computed:{
    
    }
  
}).mount('#app')