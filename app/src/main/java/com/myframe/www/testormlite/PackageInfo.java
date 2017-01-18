package com.myframe.www.testormlite;


import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by wuhai on 2017/01/18 16:32.
 * 描述：
 */

@DatabaseTable
public class PackageInfo implements Serializable{
    @DatabaseField(id = true)
    public int id;
    @DatabaseField
    public String pid;
    @DatabaseField
    public String photographerId;
    @DatabaseField
    public String name;
    @DatabaseField()
    public int cost;
    @DatabaseField
    public String description;
    @DatabaseField
    public String detail;

    // 一个套餐可以对应多个主题
    @ForeignCollectionField(eager = true) // 必须
    public ForeignCollection<Theme> themes;


    // 外部对象，一个套餐只对应一个摄影师，一个摄影师可以对应多个套餐
    @DatabaseField(foreign = true)
    public Photographer photographer;

    @Override
    public String toString() {
        return "Package [id=" + id + ", pid=" + pid + ", photographerId="
                + photographerId + ", name=" + name + ", cost=" + cost
                + ", description=" + description + ", detail=" + detail + "]";
    }
}
