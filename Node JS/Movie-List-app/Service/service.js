const fs = require('fs');
const MOVIE_DB_FILE = '../Movies.json';

module.exports = class MovieService {
    constructor() {
        fs.readFile(MOVIE_DB_FILE, (err, data) => {
            if (err) throw err;
            this.movieList = JSON.parse(data);
        });
    }
    getMovieList(){
        return this.movieList
    }

    addMovieToList(addMovieItem){
        this.movieList.push(addMovieItem);
        fs.writeFile(MOVIE_DB_FILE, JSON.stringify(this.movieList), (err) => {
            if (err) throw err;
        })
    }

    deleteMovieFromList(deleteMovieItem){
        let removedItem = this.movieList[deleteMovieItem - 1];
        this.movieList.splice((deleteMovieItem - 1), 1);
        fs.writeFile(MOVIE_DB_FILE, JSON.stringify(this.movieList), (err) => {
            if (err) throw err;  
        })
        return removedItem;
    }

    searchMovieInList(searchItem){
        let serchedItem;
        this.movieList.forEach(function(item) {
            if (item.year == searchItem){
                serchedItem = item;   
            }
        });
        return serchedItem;
    }
}
