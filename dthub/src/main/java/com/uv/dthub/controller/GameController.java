package com.uv.dthub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.dthub.model.Game;
import com.uv.dthub.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gamesService;

    @PostMapping
    public ResponseEntity<Game> createUser(@RequestBody Game games) {
    	Game createdGame = gamesService.createGame(games);
        return new ResponseEntity<>(createdGame, HttpStatus.CREATED);
    }
     
}
