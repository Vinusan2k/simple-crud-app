<template>
    <main>

        <Navbar/>
        <div class="my-5">
            <div class="mx-auto w-25" style="max-width: 100%;">
            <h2 class="text-center mb-3">Produkt hinzufügen</h2>
            <form @submit.prevent="addProdukt">
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
                <input type="number" name="preis" id="preis" class="form-control" placeholder="Preis" required v-model="produkt.preis">
            </div>
            </div>
            <div class="row"> 
                <div class="col-md-12 form-group">
                    <input type="submit" value="Submit" class="btn btn-primary w-100">
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
    name: 'AddProdukt',
    components: {
    Navbar
},

    data(){
        return{
            produkt: {
                name: '',
                anzahl: '',
                preis:''
            }
        }
    },
    methods:{
        addProdukt(){
            fetch(`http://localhost:8080/add`,{
                method: 'POST',
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