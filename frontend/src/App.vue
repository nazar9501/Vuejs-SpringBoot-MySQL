<template>
    <div id="app">
        <b-navbar toggleable="md" type="dark" variant="dark" fixed="top" class="menu">
            <b-navbar-brand href="#">BetApp</b-navbar-brand>
            <b-collapse is-nav id="nav_collapse">
                <b-navbar-nav>
                    <b-nav-item href="#list">List</b-nav-item>
                    <b-nav-item href="#add">Add</b-nav-item>
                    <b-nav-item href="#update">Update</b-nav-item>
                    <b-nav-item href="#delete">Delete</b-nav-item>
                </b-navbar-nav>
            </b-collapse>
        </b-navbar>
        
        <home></home>
        
        <b-navbar toggleable="md" type="dark" variant="dark">
            <b-navbar-nav>
                <b-nav-text>&copy; 2018 Nazar Kohut</b-nav-text>
            </b-navbar-nav>
        </b-navbar>
    </div>
</template>

<script>
import Home from './components/Home'

export default {
  name: 'app',
  components: {
    Home
  }
}
</script>