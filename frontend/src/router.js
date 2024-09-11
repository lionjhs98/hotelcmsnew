
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CleantaskCleanTaskManager from "./components/listers/CleantaskCleanTaskCards"
import CleantaskCleanTaskDetail from "./components/listers/CleantaskCleanTaskDetail"

import ReservationReservationManager from "./components/listers/ReservationReservationCards"
import ReservationReservationDetail from "./components/listers/ReservationReservationDetail"

import LostitemLostItemManager from "./components/listers/LostitemLostItemCards"
import LostitemLostItemDetail from "./components/listers/LostitemLostItemDetail"

import ConfirmConfirmManager from "./components/listers/ConfirmConfirmCards"
import ConfirmConfirmDetail from "./components/listers/ConfirmConfirmDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/cleantasks/cleanTasks',
                name: 'CleantaskCleanTaskManager',
                component: CleantaskCleanTaskManager
            },
            {
                path: '/cleantasks/cleanTasks/:id',
                name: 'CleantaskCleanTaskDetail',
                component: CleantaskCleanTaskDetail
            },

            {
                path: '/reservations/reservations',
                name: 'ReservationReservationManager',
                component: ReservationReservationManager
            },
            {
                path: '/reservations/reservations/:id',
                name: 'ReservationReservationDetail',
                component: ReservationReservationDetail
            },

            {
                path: '/lostitems/lostItems',
                name: 'LostitemLostItemManager',
                component: LostitemLostItemManager
            },
            {
                path: '/lostitems/lostItems/:id',
                name: 'LostitemLostItemDetail',
                component: LostitemLostItemDetail
            },

            {
                path: '/confirms/confirms',
                name: 'ConfirmConfirmManager',
                component: ConfirmConfirmManager
            },
            {
                path: '/confirms/confirms/:id',
                name: 'ConfirmConfirmDetail',
                component: ConfirmConfirmDetail
            },



    ]
})
