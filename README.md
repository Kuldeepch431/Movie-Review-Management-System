
# Project Explanation:
The Movie Review Management System is a Spring Boot application designed to manage movies and their reviews. This system allows administrators to add new movies and users to find movies based on title or genre. Additionally, users can add reviews and ratings for movies, which are then aggregated to provide an average rating for each movie.
    

# Adding a Movie:

Endpoint: POST /admin/movie/add
![admin_add](https://github.com/itsroshan137/Horizontal-Swiper/assets/90986796/2e5c39d1-9fbb-4688-88e2-01885d846e92)


Description: The administrator can add a new movie with a title and genre. The initial rating is set to 0.0. This is handled by the AdminController which uses AdminService to save the movie to the database.

Request Example: json Copy code { "title": "Salaar", "genre": "ACTION" } 

# Finding a Movie by Title:

Endpoint: GET /movie/title?title={title}

Description: Users can search for a movie by its title. The MovieController handles this request, using the MovieService to retrieve the movie details from the database. 

Example URL: GET localhost:8080/movie/title?title=KGF Finding 

# Movies by Genre:

Endpoint: GET /movie/genre?genre={genre}

 Description: Users can find movies by genre. The MovieController uses the MovieService to fetch and sort movies of the specified genre by their ratings. 
 
Example URL: GET localhost:8080/movie/genre?genre=ACTION

# Adding a Review:

Endpoint: POST /review/add 

Description: Users can add reviews for movies. The ReviewController processes the review request and uses ReviewService to save the review and update the movie’s average rating.

Request Example: json { "movieId": 4, "movieReview": "It was good enough", "rating": 10 } 

# Finding a Review by ID:

Endpoint: GET /review/find?reviewId={reviewId} 

Description: Users can retrieve a review by its ID. The ReviewController handles this request, using the ReviewService to fetch the review details. 

Example URL: GET localhost:8080/review/find?reviewId=52

# Tech Stack:

 Backend: Spring Boot, Spring Data JPA 
 
 Database: MySQL 
 
 ORM: Hibernate 
 
 Web Layer: Spring MVC 
 
 Dependency Management: Maven
 
 Data Transfer: JSON 
 
 Java Version: Java 17 (or the version you're using)


