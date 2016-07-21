// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from client_interface.djinni

package com.dropbox.djinni.test;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/** Record returned by a client */
public class ClientReturnedRecord implements android.os.Parcelable {


    /*package*/ final long mRecordId;

    /*package*/ final String mContent;

    /*package*/ final String mMisc;

    public ClientReturnedRecord(
            long recordId,
            @Nonnull String content,
            @CheckForNull String misc) {
        this.mRecordId = recordId;
        this.mContent = content;
        this.mMisc = misc;
    }

    public long getRecordId() {
        return mRecordId;
    }

    @Nonnull
    public String getContent() {
        return mContent;
    }

    @CheckForNull
    public String getMisc() {
        return mMisc;
    }

    @Override
    public String toString() {
        return "ClientReturnedRecord{" +
                "mRecordId=" + mRecordId +
                "," + "mContent=" + mContent +
                "," + "mMisc=" + mMisc +
        "}";
    }


    public static final android.os.Parcelable.Creator<ClientReturnedRecord> CREATOR
        = new android.os.Parcelable.Creator<ClientReturnedRecord>()
    {
        @Override
        public ClientReturnedRecord createFromParcel(android.os.Parcel in)
        {
            return new ClientReturnedRecord(in);
        }

        @Override
        public ClientReturnedRecord[] newArray(int size)
        {
            return new ClientReturnedRecord[size];
        }
    };

    public ClientReturnedRecord(android.os.Parcel in)
    {
        this.mRecordId = in.readLong();
        this.mContent = in.readString();
        if (in.readByte() == 0)
            this.mMisc = null;
        else
            this.mMisc = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {
        out.writeLong(this.mRecordId);
        out.writeString(this.mContent);
        if (this.mMisc != null) {
            out.writeByte((byte)1);
            out.writeString(this.mMisc);
        } else
            out.writeByte((byte)0);
    }

}
