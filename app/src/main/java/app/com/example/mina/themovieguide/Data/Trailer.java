package app.com.example.mina.themovieguide.Data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mina on 26-Dec-15.
 */
public class Trailer implements Parcelable{
        String Name ;
        String key ;

    public Trailer(String name, String key) {
        Name = name;
        this.key = key;
    }

    protected Trailer(Parcel in) {
        Name = in.readString();
        key = in.readString();
    }

    public static final Creator<Trailer> CREATOR = new Creator<Trailer>() {
        @Override
        public Trailer createFromParcel(Parcel in) {
            return new Trailer(in);
        }

        @Override
        public Trailer[] newArray(int size) {
            return new Trailer[size];
        }
    };

    public String getName() {
        return Name;
    }

    public String getKey() {
        return key;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(key);
    }
}
