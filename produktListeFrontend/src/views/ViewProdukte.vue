<template>
    <main>
        <Navbar />
        <div class="container">
            <div class="rows">
                <div class="col-md-12">
                <h1 class="text-center">View Produkte</h1>
                </div>
            </div>
        <div class="row justify-content-end">
            <div class="col-md-5">
                <a href="/add" class="btn btn-primary" style="margin-left: 12px;">Füge Produkte hinzu</a>
            </div>
        </div>
                <div class="rows">
                    <div class="col-md-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Name</th>
                            <th scope="col">Anzahl</th>
                            <th scope="col">Preis</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="produkt in produkte" :key="produkt.id">
                        <th scope="row">{{ produkt.id }}</th>
                        <td>{{ produkt.name }}</td>
                        <td>{{ produkt.anzahl }}</td>
                        <td>{{ produkt.preis }}€</td>
                        <td>
                            <a class ="btn btn-primary" :href="`/edit/${produkt.id}`">Ändere</a>
                            <button class="btn btn-danger mx-2" @click="deleteProdukt(produkt.id)">Löschen</button>
                        </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        </div>
    </main>
</template>

<script>

import Navbar from '../components/Navbar.vue'

export default{
    name: 'ViewProdukte',
    components : {
        Navbar
    },
    data(){
        return{
            produkte: []
        }
    },
    beforeMount() {
    this.getProdukte();
},
    methods: {
        getProdukte(){
            fetch('http://localhost:8080/produkte')
            .then(res => res.json())
            .then(data => {
                this.produkte = data
                console.log(data)
            })
        },
        deleteProdukt(id){
            fetch(`http://localhost:8080/produkt/${id}`,{
                method: 'DELETE'
            })
            .then(data => {
                console.log(data)
                this.getProdukte()
            })
        }

    },
   
}



</script>
