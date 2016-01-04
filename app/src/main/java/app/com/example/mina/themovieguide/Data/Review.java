package app.com.example.mina.themovieguide.Data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mina on 26-Dec-15.
 */
public class Review implements Parcelable {

    private String author;
    private String content;

    public static final Parcelable.Creator<Review> CREATOR = new Parcelable.Creator<Review>() {
        public Review createFromParcel(Parcel in) {
            return new Review(in);
        }

        public Review[] newArray(int size) {
            return new Review[size];
        }
    };

    public Review(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(author);
        dest.writeString(content);
    }


    private Review(Parcel in) {
        this.author = in.readString();
        this.content = in.readString();
    }
}
