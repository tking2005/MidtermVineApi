package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tarynking on 12/6/16.
 */



public class WashingtonPojo {

    @SerializedName("posts")
    @Expose
    private List<Posts> posts = null;

    /**
     *
     * @return
     * The posts
     */
    public List<Posts> getPosts() {
        return posts;
    }

    /**
     *
     * @param posts
     * The posts
     */
    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

}


