package com.yahyaalfon;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

	@Test
	public void testGetMovie() {
		Movie movie = new Movie("Upin & Ipin", Movie.REGULAR);
		Rental rental = new Rental(movie, 3);

		Assert.assertEquals(movie, rental.getMovie());
	}

	@Test
	public void testGetDaysRented() {
		Movie movie = new Movie("Upin & Ipin", Movie.REGULAR);
		Rental rental = new Rental(movie, 3);

		Assert.assertEquals(Integer.valueOf(3), rental.getDaysRented());
	}

	@Test
	public void testGetCharge() {
		Movie movie = new Movie("Upin & Ipin", Movie.REGULAR);
		Rental rental = new Rental(movie, 3);

		Assert.assertEquals(Double.valueOf(3.5), rental.getCharge());
	}

	@Test
	public void testGetFrequentRenterPoints() {
		Movie movie = new Movie("Upin & Ipin", Movie.REGULAR);
		Rental rental = new Rental(movie, 3);

		Assert.assertEquals(Integer.valueOf(1), rental.getFrequentRenterPoints());
	}
}