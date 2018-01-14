/*
 * Copyright 2018,  Jayant Singh, All rights reserved.
 */

package db;

import android.provider.BaseColumns;

/**
 * Created by Jayant Singh on 29-03-2017.
 */

public class SchemaOutPassSigned {

    static final String CREATE_ENTRIES = "CREATE TABLE " +
            OutPassColumns.TABLE_NAME + " (" +
            OutPassColumns._ID + " INTEGER PRIMARY KEY," +
            OutPassColumns.COLUMN_NAME_ID + " TEXT," +
            OutPassColumns.COLUMN_NAME_UID + " TEXT," +
            OutPassColumns.COLUMN_NAME_NAME + " TEXT," +
            OutPassColumns.COLUMN_NAME_PHONE_NUMBER + " TEXT," +
            OutPassColumns.COLUMN_NAME_BRANCH + " TEXT," +
            OutPassColumns.COLUMN_NAME_YEAR + " TEXT," +
            OutPassColumns.COLUMN_NAME_ROOM_NUMBER + " TEXT," +
            OutPassColumns.COLUMN_NAME_TIME_LEAVE + " TEXT," +
            OutPassColumns.COLUMN_NAME_TIME_RETURN + " TEXT," +
            OutPassColumns.COLUMN_NAME_PHONE_NUMBER_VISITING + " TEXT," +
            OutPassColumns.COLUMN_NAME_REASON_VISIT + " TEXT," +
            OutPassColumns.COLUMN_NAME_VISITING_ADDRESS + " TEXT," +
            OutPassColumns.COLUMN_NAME_WARDEN_SIGNED + " BOOLEAN null," +
            OutPassColumns.COLUMN_NAME_HOD_SIGNED + " BOOLEAN null," +
            OutPassColumns.COLUMN_NAME_DIRECTOR_SIGNED + " BOOLEAN null," +
            OutPassColumns.COLUMN_OUT_PASS_TYPE + " TEXT" + ")";

    public SchemaOutPassSigned() {
    }

    static class OutPassColumns implements BaseColumns {
        static final String TABLE_NAME = "outPassSigned";
        static final String COLUMN_NAME_ID = "id";
        static final String COLUMN_NAME_UID = "uid";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_PHONE_NUMBER = "phoneNumber";
        static final String COLUMN_NAME_BRANCH = "branch";
        static final String COLUMN_NAME_YEAR = "year";
        static final String COLUMN_NAME_ROOM_NUMBER = "roomNumber";
        static final String COLUMN_NAME_TIME_LEAVE = "timeLeave";
        static final String COLUMN_NAME_TIME_RETURN = "timeReturn";
        static final String COLUMN_NAME_PHONE_NUMBER_VISITING = "phoneNumberVisiting";
        static final String COLUMN_NAME_REASON_VISIT = "reasonVisit";
        static final String COLUMN_NAME_VISITING_ADDRESS = "visitingAddress";
        static final String COLUMN_NAME_WARDEN_SIGNED = "wardenSigned";
        static final String COLUMN_NAME_HOD_SIGNED = "hodSigned";
        static final String COLUMN_NAME_DIRECTOR_SIGNED = "directorSigned";
        static final String COLUMN_OUT_PASS_TYPE = "outPassType";
    }
}