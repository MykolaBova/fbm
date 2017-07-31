package com.fbm.repository;


import com.football.fbm.domain.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Mocart on 07-Jul-17.
 */
public interface CardRepository extends CrudRepository<Card, Long> {
    @Override
    List<Card> findAll();

    List<Card> findByPlayer_PlayerId(long playerId);

//
//    List<Card> findByUsers_UserName(String userName);
//
//    List<Card> findByUsers_userId(long userId);
//
//    List<Card> findAllByUsers_UserIdAnAndAndPlayer_Team_TeamId(long userId, long team);
}