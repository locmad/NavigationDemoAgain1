package locnv27.fpoly.navigationdemoagain.database;/*
///
/// Project: NavigationDemoAgain
/// Created by NguyenLoc on 7/16/2022.
/// Copyright © 2018-2019 Beeknights Co., Ltd. All rights reserved.
///
*/

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insert(User user);

    @Query("SELECT * FROM user")
    List<User>getAll();

    @Update
    void update(User user);

}
