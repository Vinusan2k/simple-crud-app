<template>
    <main>

        <Navbar/>
        <div class="my-5">
            <div class= "mx-auto w-25" style="max-width: 100;">
            <h2 class="text-center mb-3">Produkt überarbeiten</h2>
            <form @submit.prevent= "updateProdukt">
                <div class="row">
            <div class="col-md-12 form-group mb-3">
                <label for ="name" class="form-label">Name</label>
                <input type="text" name="name" id="name" class="form-control" placeholder="Name" required v-model="produkt.name">
            </div>
            </div>
            <div class="row">
            <div class="col-md-12 form-group mb-3">
                <label for ="anzahl" class="form-label">Anzahl</label>
                <input type="number" name="anzahl" id="naanzahlme" class="form-control" placeholder="Anzahl" required v-model="produkt.anzahl">
            </div>
            </div>
            <div class="row">
            <div class="col-md-12 form-group mb-3">
                <label for ="preis" class="form-label">Preis</label>
                <input type="text" name="preis" id="preis" class="form-control" placeholder="Preis" required v-model="produkt.preis" pattern="[0-9]+(\.[0-9]+)?">
            </div>
            </div>
            <div class="row"> 
                <div class="col-md-12 form-group">
                    <input class="btn btn-primary w-100" type="submit" value="Submit" >
                </div>
            </div>
            </form>
            </div>
        </div>
    </main>
</template>

<script>
import Navbar from '../components/Navbar.vue';

export default{
    name: 'UpdateProdukt',
    components: {
        Navbar
    },

    data(){
        return {
            produkt: {
                id: '',
                name:'',
                anzahl: '',
                preis:''
            }
        }
    },
    beforeMount(){
        this.getProdukt()
    },

    methods: {
        getProdukt(){
            fetch(`http://localhost:8080/produkt/${this.$route.params.id}`)
            .then(res => res.json())
            .then(data => {
                this.produkt = data;
                console.log(this.produkt)
            })
        },

        updateProdukt(){
            fetch(`http://localhost:8080/produkt`,{
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.produkt)
            })
            .then(data => {
                console.log(data)
                this.$router.push('/')
            })
        }
    }
}
</script>