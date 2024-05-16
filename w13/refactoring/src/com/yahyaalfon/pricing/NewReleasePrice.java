package com.yahyaalfon.pricing;

import com.yahyaalfon.Movie;

public class NewReleasePrice extends Price {

	@Override
	public Integer getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public Double getCharge(Integer daysRented) {
		return daysRented * 3.0;
	}

	@Override
	public Integer getFrequentRenterPoints(Integer daysRented) {
		if (daysRented > 1)
			return 2;
		else
			return 1;
	}
}
