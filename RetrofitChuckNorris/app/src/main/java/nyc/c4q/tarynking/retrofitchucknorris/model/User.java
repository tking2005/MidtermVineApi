package nyc.c4q.tarynking.retrofitchucknorris.model;

import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:



    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private List<Field> profile;
    private boolean isAdmin;
    private boolean isOwner;
    private boolean isPrimaryOwner;
    private boolean isRestricted;
    private boolean isUltraRestricted;
    private boolean has2Fa;
    private String twoFactorType;
    private boolean hasFiles;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getColor() {
        return color;
    }

    public List<Field> getProfile() {
        return profile;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public boolean isUltraRestricted() {
        return isUltraRestricted;
    }

    public boolean isHas2Fa() {
        return has2Fa;
    }

    public String TwoFactorType() {
        return twoFactorType;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }

    // "id"
    // "name"
    // "deleted"
    // "color"
    // "profile"
    // "is_admin"
    // "is_owner"
    // "is_primary_owner"
    // "is_restricted"
    // "is_ultra_restricted"
    // "has_2fa"
    // "two_factor_type"
    // "has_files"

    // TODO add getters to access private fields
}
