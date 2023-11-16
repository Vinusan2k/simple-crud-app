import { createRouter, createWebHistory } from 'vue-router'
import ViewProdukte from '../views/ViewProdukte.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: ViewProdukte
    },
    {
     path: '/add',
     name: 'add',
     component:()=> import ('../views/AddProdukt.vue')
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component:()=>import('../views/UpdateProdukt.vue')
     }
  ]
})

export default router
