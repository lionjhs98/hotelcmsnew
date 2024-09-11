<template>

    <v-data-table
        :headers="headers"
        :items="cleanTaskManagement"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'CleanTaskManagementView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            cleanTaskManagement : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/cleanTaskManagements'))

            temp.data._embedded.cleanTaskManagements.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.cleanTaskManagement = temp.data._embedded.cleanTaskManagements;
        },
        methods: {
        }
    }
</script>

