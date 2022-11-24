package locnv27.fpoly.navigationdemoagain.database;/*
///
/// Project: NavigationDemoAgain
/// Created by NguyenLoc on 7/16/2022.
/// Copyright © 2018-2019 Beeknights Co., Ltd. All rights reserved.
///
*/

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "password")
    private String passwrod;

    public User(String name, String passwrod) {
        this.name = name;
        this.passwrod = passwrod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
