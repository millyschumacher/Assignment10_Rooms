package com.example.owner.assignment10_rooms;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import java.util.List;

/**
 * UserDao
 *
 * This is the user Dao class
 */
@Dao
public interface UserDao {
    /**
     * Adds the user
     * @param user
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addUser(User user);

    /**
     * Queries the user
     * @return
     */
    @Query("select * from user")
    public List<User> getAllUser();

    /**
     * Queries the user's ID
     * @param userId
     * @return
     */
    @Query("select * from user where id = :userId")
    public List<User> getUser(long userId);

    /**
     * Updates the user data
     * @param user
     */
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateUser(User user);

    /**
     * Deletes the user
     */
    @Query("delete from user")
    void removeAllUsers();
}
