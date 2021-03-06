package com.mike.movies.watchlist.letterboxd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.mike.movies.Movie;
import com.mike.movies.watchlist.FileWatchlistParser;

@Component
@Profile("letterboxd")
public class LetterboxdWatchlistParser extends FileWatchlistParser {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LetterboxdWatchlistParser.class); 
	
	//TODO: csv parser lib
	protected Movie getMovieNameAndYear(String line) {
		String[] details = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		return new Movie(details[1], details[2]);
	}

}
