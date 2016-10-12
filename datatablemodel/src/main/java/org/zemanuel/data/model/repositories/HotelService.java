package org.zemanuel.data.model.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zemanuel.data.model.entites.City;
import org.zemanuel.data.model.entites.Hotel;
import org.zemanuel.data.model.entites.Review;
import org.zemanuel.data.model.entites.ReviewDetails;

public interface HotelService {

	Hotel getHotel(City city, String name);

	Page<Review> getReviews(Hotel hotel, Pageable pageable);

	Review getReview(Hotel hotel, int index);

	Review addReview(Hotel hotel, ReviewDetails details);

	ReviewsSummary getReviewSummary(Hotel hotel);

}