package com.uv.dthub.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uv.dthub.model.Game;
import com.uv.dthub.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    // Create a new game
    public Game createGame(Game game) {
        game.setCreatedAt(new Date());
        game.setUpdatedAt(new Date());
        return gameRepository.save(game);
    }

    // Retrieve a game by its ID
    public Optional<Game> getGameById(ObjectId id) {
        return gameRepository.findById(id);
    }

    // Retrieve all games
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    // Retrieve games by developer ID
    public List<Game> getGamesByDeveloperId(ObjectId developerId) {
        return gameRepository.findByDeveloperId(developerId);
    }

    // Retrieve games by status
    public List<Game> getGamesByStatus(String status) {
        return gameRepository.findByStatus(status);
    }

    // Update an existing game
    public Game updateGame(ObjectId id, Game game) {
        Optional<Game> existingGame = gameRepository.findById(id);
        if (existingGame.isPresent()) {
            Game updatedGame = existingGame.get();
            updatedGame.setTitle(game.getTitle());
            updatedGame.setDescription(game.getDescription());
            updatedGame.setGooglePlayLink(game.getGooglePlayLink());
            updatedGame.setTypeOfTesting(game.getTypeOfTesting());
            updatedGame.setTargetAudience(game.getTargetAudience());
            updatedGame.setStatus(game.getStatus());
            updatedGame.setUpdatedAt(new Date());
            return gameRepository.save(updatedGame);
        } else {
            return null;
        }
    }

    // Delete a game by its ID
    public void deleteGame(ObjectId id) {
        gameRepository.deleteById(id);
    }
}

