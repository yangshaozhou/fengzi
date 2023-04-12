import {createStore} from 'vuex'
const store = createStore({
    state:{
       problemsList: [],
       filteredList:[],
    },
    mutations:{
        updateState(state,status)
        {
            state.problemsList = status
            state.filteredList = status
        },
        updateFilterState(state,data)
        {
            state.filteredList = data
        }
    }
})
export default store
