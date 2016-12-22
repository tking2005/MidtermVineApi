package nyc.c4q.tarynking.retrofitchucknorris.model;

import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a channel object, which contains information about a team channel.
 * See https://api.slack.com/types/channel
 *
 */

public class Channel {

    private String id;
    private String name;
    private String creator;
    private String lastRead;

    private Topic topic;
    private Purpose purpose;

    private List<String> members;
    private Message latest;

    private boolean isArchived;
    private boolean isGeneral;
    private boolean isChannel;
    private boolean isMember;

    private long created;
    private long unreadCount;
    private long unreadCountDisplay;



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public String getLastRead() {
        return lastRead;
    }

    public Topic getTopic() {
        return topic;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public List<String> getMembers() {
        return members;
    }

    public Message getLatest() {
        return latest;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public boolean isChannel() {
        return isChannel;
    }

    public boolean isMember() {
        return isMember;
    }

    public long getCreated() {
        return created;
    }

    public long getUnreadCount() {
        return unreadCount;
    }

    public long getUnreadCountDisplay() {
        return unreadCountDisplay;
    }
}
