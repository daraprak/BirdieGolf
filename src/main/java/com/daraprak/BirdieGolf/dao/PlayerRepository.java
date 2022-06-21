package com.daraprak.BirdieGolf.dao;

import com.daraprak.BirdieGolf.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
}