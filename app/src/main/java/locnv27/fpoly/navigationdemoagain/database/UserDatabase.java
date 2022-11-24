package locnv27.fpoly.navigationdemoagain.database;/*
///
/// Project: NavigationDemoAgain
/// Created by NguyenLoc on 7/19/2022.
/// Copyright © 2018-2019 Beeknights Co., Ltd. All rights reserved.
///
*/

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = User.class,version = 1)
public abstract class UserDatabase extends RoomDatabase {
    public static final String DATANAME="user.db";
    public static UserDatabase instance;
    public static synchronized UserDatabase getInstance(Context mContext){
        if(instance==null){
            instance= Room.databaseBuilder(mContext.getApplicationContext(),
                    UserDatabase.class,DATANAME).
                    allowMainThreadQueries().
                    build();
        }
        return instance;
    }
    public abstract UserDAO userDAO();
}
