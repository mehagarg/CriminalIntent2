package com.bignerdranch.meha.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by meha on 3/13/16.
 */
public class Crime {
    private String title;
    private UUID mId;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        this.mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return mId;
    }
}
