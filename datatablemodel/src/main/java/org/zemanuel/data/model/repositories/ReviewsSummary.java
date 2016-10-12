package org.zemanuel.data.model.repositories;

import org.zemanuel.data.model.entites.Rating;

public interface ReviewsSummary {

	long getNumberOfReviewsWithRating(Rating rating);
}
