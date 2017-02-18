package nyc.c4q.tarynking.vinemidtermreview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tarynking on 12/10/16.
 */
public class Repost {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("verified")
    @Expose
    private Long verified;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("flags|platform_lo")
    @Expose
    private Long flagsPlatformLo;
    @SerializedName("repostId")
    @Expose
    private Long repostId;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("userId")
    @Expose
    private Long userId;
    @SerializedName("profileBackground")
    @Expose
    private String profileBackground;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("postId")
    @Expose
    private Long postId;
    @SerializedName("ipAddress")
    @Expose
    private Long ipAddress;
    @SerializedName("flags|platform_hi")
    @Expose
    private Long flagsPlatformHi;
    @SerializedName("sourceType")
    @Expose
    private Long sourceType;
    @SerializedName("sourceId")
    @Expose
    private Long sourceId;

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The verified
     */
    public Long getVerified() {
        return verified;
    }

    /**
     *
     * @param verified
     * The verified
     */
    public void setVerified(Long verified) {
        this.verified = verified;
    }

    /**
     *
     * @return
     * The vanityUrls
     */
    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    /**
     *
     * @param vanityUrls
     * The vanityUrls
     */
    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    /**
     *
     * @return
     * The flagsPlatformLo
     */
    public Long getFlagsPlatformLo() {
        return flagsPlatformLo;
    }

    /**
     *
     * @param flagsPlatformLo
     * The flags|platform_lo
     */
    public void setFlagsPlatformLo(Long flagsPlatformLo) {
        this.flagsPlatformLo = flagsPlatformLo;
    }

    /**
     *
     * @return
     * The repostId
     */
    public Long getRepostId() {
        return repostId;
    }

    /**
     *
     * @param repostId
     * The repostId
     */
    public void setRepostId(Long repostId) {
        this.repostId = repostId;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The profileBackground
     */
    public String getProfileBackground() {
        return profileBackground;
    }

    /**
     *
     * @param profileBackground
     * The profileBackground
     */
    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    /**
     *
     * @return
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The postId
     */
    public Long getPostId() {
        return postId;
    }

    /**
     *
     * @param postId
     * The postId
     */
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /**
     *
     * @return
     * The ipAddress
     */
    public Long getIpAddress() {
        return ipAddress;
    }

    /**
     *
     * @param ipAddress
     * The ipAddress
     */
    public void setIpAddress(Long ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     *
     * @return
     * The flagsPlatformHi
     */
    public Long getFlagsPlatformHi() {
        return flagsPlatformHi;
    }

    /**
     *
     * @param flagsPlatformHi
     * The flags|platform_hi
     */
    public void setFlagsPlatformHi(Long flagsPlatformHi) {
        this.flagsPlatformHi = flagsPlatformHi;
    }

    /**
     *
     * @return
     * The sourceType
     */
    public Long getSourceType() {
        return sourceType;
    }

    /**
     *
     * @param sourceType
     * The sourceType
     */
    public void setSourceType(Long sourceType) {
        this.sourceType = sourceType;
    }

    /**
     *
     * @return
     * The sourceId
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     *
     * @param sourceId
     * The sourceId
     */
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

}
