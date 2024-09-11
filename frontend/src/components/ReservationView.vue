<template>

    <v-data-table
        :headers="headers"
        :items="reservation"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ReservationView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            reservation : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/reservations'))

            temp.data._embedded.reservations.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.reservation = temp.data._embedded.reservations;
        },
        methods: {
        }
    }
</script>

