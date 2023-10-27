package org.test.ws_sh.data.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.test.ws_sh.data.model.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Insert
    void insert(Task task);

    @Update
    void update(Task task);

    @Delete
    void delete(Task task);

    @Query("SELECT * FROM tasks")
    List<Task> tasks();

    @Query("SELECT * FROM tasks WHERE id = :id")
    Task getTask(int id);

    @Query("SELECT * FROM tasks")
    List<Task> getAllTasks();
}
