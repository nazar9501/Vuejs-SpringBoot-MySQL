<template>
	<div>
		  
		<div class="container div-height">	
			<div class="row text-center">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div id="list"></div>
					<h2 class="margin-top">List of bets</h2>
				</div>
				<div class="col-md-4"></div>
			</div>
		  
		  	<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<table class="table table-bordered">
						<thead class="thead-dark">
							<tr class="text-center">
								<th>Id</th>
								<th>Name</th>
								<th>W1</th>
								<th>X</th>
								<th>W2</th>
							</tr>
						</thead>
						<tbody>
							<tr v-for="post of posts">
								<td class="text-center">{{post.id}}</td>
								<td>{{post.name}}</td>
								<td class="text-center">{{post.w1}}</td>
								<td class="text-center">{{post.x}}</td>
								<td class="text-center">{{post.w2}}</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col-md-2">
					<button type="button" class="btn btn-outline-primary" v-on:click="updateList">Update list</button>
				</div>
			</div>
	  	</div>

		<div class="container div-height">
			<div class="row text-center">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div id="add"></div>
					<h3 class="margin-top">Add bet</h3>
				</div>
				<div class="col-md-4"></div>
			</div>
			
			<div class="row">					
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<form>
						<div class="form-group">
							<label for="name">Name:</label>
							<input type="text" class="form-control" id="name" v-model="bet.name" />
						</div>
						<div class="form-group">
							<label for="w1">W1:</label>
							<input type="text" class="form-control" id="w1" v-model="bet.w1" />
						</div>
						<div class="form-group">
							<label for="x">X:</label>
							<input type="text" class="form-control" id="x" v-model="bet.x" />
						</div>
						<div class="form-group">
							<label for="w2">W2:</label>
							<input type="text" class="form-control" id="w2" v-model="bet.w2" />
						</div>
						<br />
						<button type="button" class="btn btn-outline-primary" v-on:click="addData">Add bet</button>
					</form>
				</div>
				<div class="col-md-4"></div>
			</div>
		</div>

		<div class="container div-height">
			<div class="row text-center">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div id="update"></div>
					<h3 class="margin-top">Update bet</h3>
				</div>
				<div class="col-md-4"></div>
			</div>

			<div class="row">					
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<form>
						<div class="form-group">
							<label for="id">Id:</label>
							<input type="text" class="form-control" id="id" v-model="id" />
						</div>
						<div class="form-group">
							<label for="name">Name:</label>
							<input type="text" class="form-control" id="name" v-model="bet.name" />
						</div>
						<div class="form-group">
							<label for="w1">W1:</label>
							<input type="text" class="form-control" id="w1" v-model="bet.w1" />
						</div>
						<div class="form-group">
							<label for="x">X:</label>
							<input type="text" class="form-control" id="x" v-model="bet.x" />
						</div>
						<div class="form-group">
							<label for="w2">W2:</label>
							<input type="text" class="form-control" id="w2" v-model="bet.w2" />
						</div>
						<br />
						<button type="button" class="btn btn-outline-primary" v-on:click="updateData">Update bet</button>
					</form>
				</div>
				<div class="col-md-4"></div>
			</div>
		</div>

		<div class="container div-height">
			<div class="row text-center">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<div id="delete"></div>
					<h3 class="margin-top">Delete bet</h3>
				</div>
				<div class="col-md-4"></div>
			</div>

			<div class="row">					
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<form>
						<div class="form-group">
							<label for="id">Id:</label>
							<input type="text" class="form-control" id="id" v-model="id" />
						</div>
						<br />
						<button type="button" class="btn btn-outline-primary" v-on:click="deleteData">Delete bet</button>
					</form>
				</div>
				<div class="col-md-4"></div>
			</div>
		</div>
  
	</div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'home',
	data () {
    return {
      posts: [],
			id: '',
      bet: {
				name: '',
				w1: '',
				x: '',
				w2: ''
			}
    }
  },
  methods: {
    addData: function() {
    	axios.post(`http://localhost:8080/api/data/save`, {
			name: this.bet.name,
			w1: this.bet.w1,
			x: this.bet.x,
			w2: this.bet.w2
		})
		.then(response => {});
		this.bet.name = this.bet.w1 = this.bet.x = this.bet.w2 = '';
		e.preventDefault();
	},
	deleteData: function() {
    	axios.post(`http://localhost:8080/api/data/delete`, {
			id: this.id
		})
		.then(response => {});
		this.id = '';
		e.preventDefault();
	},
	updateData: function() {
    	axios.post(`http://localhost:8080/api/data/update`, {
			id: this.id,
			name: this.bet.name,
			w1: this.bet.w1,
			x: this.bet.x,
			w2: this.bet.w2
		})
		.then(response => {});
		this.id = this.bet.name = this.bet.w1 = this.bet.x = this.bet.w2 = '';
		e.preventDefault();
	},
	updateList: function() {
		axios.get(`http://localhost:8080/api/data`)
		.then(response => {
			this.posts = response.data
		})
	}

  },
  created () {
    axios.get(`http://localhost:8080/api/data`)
      .then(response => {
        this.posts = response.data
      })
  }
}
</script>