package com.example.owner.assignment10_rooms;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * TrophyDao()
 *
 * This is the trophy Dao class
 */
@Dao
public interface TrophyDao {
    /**
     * Method to add the trophy
     * @param trophy
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addTrophy(Trophy trophy);

    /**
     * Method queries the trophy data
     * @param userId
     * @return
     */
    @Query("SELECT * FROM trophy WHERE userId=:userId")
    List<Trophy> findTrophiesForUser(int userId);

    /**
     * This method updates the trophy data
     * @param trophy
     */
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateTrophy(Trophy trophy);

    /**
     * The method deletes the trophy data
     * @param id
     */
    @Query("delete from trophy where id = :id")
    void delete(long id);

}