package edu.ucsb.cs156.example.repositories;

import edu.ucsb.cs156.example.entities.MenuItemReview;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuItemReviewRespository extends CrudRepository<MenuItemReview, Long> {
     
}