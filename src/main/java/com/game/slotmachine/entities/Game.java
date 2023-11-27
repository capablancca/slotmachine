package com.game.slotmachine.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gameId;
    private int slot1;
    private int slot2;
    private LocalDateTime gameTimeStamp;
    private double totalAmount;
    private double totalRewardDisbursed;
    private boolean isGameOver;

    public Game(int slot1, int slot2, LocalDateTime gameTimeStamp, double totalAmount, double totalRewardDisbursed, boolean isGameOver) {
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.gameTimeStamp = gameTimeStamp;
        this.totalAmount = totalAmount;
        this.totalRewardDisbursed = totalRewardDisbursed;
        this.isGameOver = isGameOver;
    }
}
